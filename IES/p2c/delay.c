#include<reg51.h>

sbit led = P2^0;

void delay(void);

int main() {
	led = 0;
	while(1) {
		led = 1;
		delay();
		led = 0;
		delay();
	}
}

void delay(void) {
	TMOD = 0x01;
	TH0 = 0xFF;
	TL0 = 0x00;
	TR0 = 1;
	while(TF0 == 0);
	TR0 = 0;
	TF0 = 0;
}