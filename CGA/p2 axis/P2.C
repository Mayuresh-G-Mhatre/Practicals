#include<stdio.h>
#include<conio.h>
#include<graphics.h>

void main() {
	int gd=DETECT, gm;
	int midx, midy;
	initgraph(&gd, &gm, "..\\BGI");
	cleardevice();
	midx = getmaxx()/2;
	midy = getmaxy()/2;
	line(1, midy, 640, midy);
	line(midx, 1, midx, 480);
	getch();
	closegraph();
}