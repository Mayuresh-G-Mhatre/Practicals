#include<stdio.h>
#include<conio.h>
#include<graphics.h>

void main() {
	int gd=DETECT, gm;
	initgraph(&gd, &gm, "..\\BGI");
	arc(100, 100, 0, 135, 50);
	bar(300, 300, 400, 400);
	circle(100, 300, 50);
	getch();
	closegraph();
}