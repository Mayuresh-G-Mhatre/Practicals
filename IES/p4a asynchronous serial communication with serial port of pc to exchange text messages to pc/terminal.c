#include<reg51.h>

void send(char x);

void main(void)	{
	TMOD = 0X20; //set timer 1 in 8-bit auto relaod mode
	TH1 = 0XFD; //set baud rate 9600
	SCON = 0X50; //configure SCON register
	TR1 = 1;
	send('S');
	send('h');
	send('u');
	send('b');
	send('h');
	send('a');
	send('m');
	while(1);
}

void send (char x) {
	SBUF = x;
	while(TI==0); //wait till transmission is finished and value is TI=1
	TI=0; //clear flag
}
