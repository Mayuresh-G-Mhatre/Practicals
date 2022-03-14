#include<graphics.h>
#include<stdio.h>
#include<conio.h>

void main() {
	int gd=DETECT, gm;
	initgraph(&gd, &gm, "..\\BGI");
	// for head
	circle(200, 200, 30);
	// for left eye
	circle(190, 190, 5);
	arc(190, 190, 50, 130, 10);
	// for right eye
	circle(210, 190, 5);
	arc(210, 190, 50, 130, 10);
	// for smiley lips
	arc(200, 210, 180, 360, 10);
	line(187, 210, 193, 210);
	line(207, 210, 213, 210);
	// for nose
	circle(200, 201, 4);
	getch();
	closegraph();
}