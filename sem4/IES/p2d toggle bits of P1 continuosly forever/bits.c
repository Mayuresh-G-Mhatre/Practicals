#include <reg51.h>

void main(void) {
	unsigned int x;
	for(;;) {
		P1=0x55;
		for(x=0;x<40000;x++);
		P1=0xAA;
		for(x=0;x<40000;x++);
	}
}
