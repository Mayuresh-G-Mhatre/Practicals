#include<reg51.h>		/* Include x51 header file */
sbit led = P2^0;		/* set test pin0 of port2 */

void Delay(void);

int main() {
	led=0;
	while(1) {
		led=1;
    Delay();
    led=0;
		Delay();
	}
}

void Delay() {
	TMOD = 0x01;		/* Timer0 mode1 */
	TH0 = 0xFF;		/* 10ms timer value */
	TL0 = 0x00;      
	TR0 = 1;  	      	/* Start timer0 */
	while(TF0 == 0);
	TR0 = 0;
	TF0 = 0;
}
