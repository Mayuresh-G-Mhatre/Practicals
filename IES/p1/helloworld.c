#include<reg51.h>
#include<stdio.h>

void main(void) {
	SCON = 0x50;
	TMOD = 0x20;
	TH1 = 221;
	TR1 = 1;
	TI = 1;
	while(1) {
		printf("Hello World\n");
	}
}