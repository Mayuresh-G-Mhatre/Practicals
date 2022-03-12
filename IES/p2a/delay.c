#include<stdio.h>
#include<reg51.h>

void delay();

void main() {
	while(1) {
		P2 = 0xFF;
		delay();
		P2 = 0x00;
		delay();
	}
}

void delay() {
	unsigned int i , j, k;
	
	for(i=0; i<10; i++)
	for(j=0; j<200; j++)
	for(k=0; k<300; k++);
}
	