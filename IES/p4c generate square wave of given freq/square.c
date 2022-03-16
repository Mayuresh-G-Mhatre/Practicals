#include<reg51.h>

void delay();

void main() {
	P2=0X00;
	while(1) {
		P2=0xFF;
		delay();
		P2=0x00;
	delay();
	}
}

void delay() {
	long i=0;
	for(i=0;i<=5000;i++) {
	}
}
