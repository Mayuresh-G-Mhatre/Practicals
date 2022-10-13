import RPi.GPIO as gpio
import picamera
import time

led = 21			# pin no 40
buz = 12			# pin no 32

butcapture=16		# pin no 36
butrecord = 20		# pin no 38

HIGH=1 
LOW=0

gpio.setwarnings(False) 
gpio.setmode(gpio.BCM) 
gpio.setup(led, gpio.OUT) 
gpio.setup(buz, gpio.OUT)
gpio.setup(butcapture, gpio.IN, pull_up_down=gpio.PUD_UP) 
gpio.setup(butrecord, gpio.IN, pull_up_down=gpio.PUD_UP) 
gpio.output(led , 0)
gpio.output(buz , 0) 
data=""

def capture_image():
    print('Please Wait...')
    data= time.strftime("%d_%b_%Y\%H:%M:%S")
    camera.start_preview()
    time.sleep(5)
    print(data)
    camera.capture('/home/pi/Desktop/Visitors/%s.jpg'%data)
    camera.stop_preview()
    print('Image Captured successfully')
    time.sleep(2)

def record_video():
    print('Please Wait...')
    data= time.strftime("%d_%b_%Y\%H:%M:%S")
    camera.start_preview()
    camera.start_recording('/home/pi/Desktop/Visitors/rec.h264')
    time.sleep(5)
    print(data)
    camera.stop_recording()
    camera.stop_preview()
    print('Video recorded successfully')
    time.sleep(2)

print('Welcome to my System') time.sleep(2)

print('Visitor Monitor System using RPi') time.sleep(3)

camera = picamera.PiCamera() 
camera.rotation=180 
camera.awb_mode= 'auto' 
camera.brightness=55

print("Please Press Button")
time.sleep(2)
try:
    while 1:
d= time.strftime("%d %b %Y") 
t= time.strftime("%H:%M:%S") 
print("Time: %s"%t) 
print("Date:%s"%d) 
gpio.output(led, 1)
 	
if gpio.input(butcapture)==False: 
gpio.output(buz, 1)
gpio.output(led, 0) 
time.sleep(0.5)
gpio.output(buz, 0)
capture_image()

if gpio.input(butrecord)==False: 
gpio.output(buz, 1)
gpio.output(led, 0) 
time.sleep(0.5) 
gpio.output(buz, 0) 
record_video()

time.sleep(0.5)

except KeyboardInterrupt:
print("Done......")
time.sleep(3)
gpio.output(led, 0)
finally:
exit(0)
