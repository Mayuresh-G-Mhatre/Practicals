#include<reg51.h>
#include<intrins.h>

void main(void) {
	unsigned int i;
	unsigned int wavevalue[16] = {128, 192, 224, 255, 240, 224, 192, 128, 64, 32, 16, 0, 16, 32, 64};
	
	while(1) {
		for(i=0; i<16; i++) {
			P1 = wavevalue[i];
			_nop_();
			_nop_();
			_nop_();
			_nop_();
			_nop_();
			_nop_();
		}
	}
}