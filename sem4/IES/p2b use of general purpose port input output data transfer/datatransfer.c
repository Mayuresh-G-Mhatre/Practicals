#include<reg51.h>

void main() {
		unsigned char x;
		P2=0xFF;
    P3=0x00;
    while(1) {
			x=P2;
			P3=x;
		}
}
