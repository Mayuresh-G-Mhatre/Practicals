#include<reg51.h>

void main() {
	unsigned char i=0;
	while(1) {
		for(i=0;i<0xff;i++) {
			P1=i;
		}
		for(i=0xfe;i<0x00;i--) {
			P1=i;
		}
	}
}
