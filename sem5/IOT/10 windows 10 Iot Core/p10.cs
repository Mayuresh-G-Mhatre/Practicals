using Windows.Devices.Gpio;	

namespace LED_Blink_win
{
/// <summary>
/// An empty page that can be used on its own or navigated to within a Frame.
/// </summary>
public sealed partial class MainPage : Page
{
private int red_state = 1; 
private const int RED = 4; 
private GpioPin redPin; 
public MainPage()
{
this.InitializeComponent(); 
InitGPIO();
}
private void InitGPIO()
{
var gpio = GpioController.GetDefault(); 
redPin = gpio.OpenPin(RED); 
redPin.Write(GpioPinValue.Low);
redPin.SetDriveMode(GpioPinDriveMode.Output);
}	


private void Button_Click(object sender, RoutedEventArgs e)
{
if (red_state == 0)
{
redPin.Write(GpioPinValue.Low); 
red_state = 1;
TXT1.Text = "LED OFF";
}
else if (red_state == 1)
{
redPin.Write(GpioPinValue.High); 
red_state = 0;
TXT1.Text = "LED ON";
}
}

private void MainPage_Unloaded(object sender, object args)
{
redPin.Dispose();
}
}
}
