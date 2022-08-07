#include<reg51.h>

int i = 0;		
void time_ISR(void)interrupt 1 {
	i++;
	if(i==10) {
		i=0;
		P1++;
	}
}

void main(void) {
	TMOD = 0X01; //mode 1 of timer 0
  ET0 = 1; //enable timer 0 interrupt
  TR0 = 1; //run the timer 0 mode
  EA = 1; // enable the global interrupt flag
  while(1);
}
