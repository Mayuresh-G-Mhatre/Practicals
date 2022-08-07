#include<stdio.h>
#include<conio.h>
#include<graphics.h>

void pixel(int xc, int yc, int x, int y);

void main() {
	int gd=DETECT, gm, xc, yc, x, y, r, Pk;
	clrscr();

	initgraph(&gd, &gm, "..\\BGI");

	printf("***Brensenham's Midpoint algorithm of circle***\n");
	printf("Enter the value of Xc: ");
	scanf("%d", &xc);
	printf("Enter the value of Yc: ");
	scanf("%d", &yc);
	printf("Enter the radius of circle: ");
	scanf("%d", &r);

	x = 0;
	y = r;
	Pk = 1 - r;
	pixel(xc, yc, x, y);

	while(x<y) {
		if(Pk<0) {
			x = x + 1;		
			Pk = Pk + (2*x) + 1;
		}
		else {
			x = x + 1;
			y = y - 1;
			Pk = Pk + (2*x) - (2*y) + 1;
		}

		pixel(xc, yc, x, y);
		delay(50);
	}

	getch();
	closegraph();
}

void pixel(int xc, int yc, int x, int y) {
	putpixel(xc + x, yc + y, 7);
	putpixel(xc - x, yc - y, 7);
	putpixel(xc + x, yc - y, 7);
	putpixel(xc - x, yc + y, 7);
	putpixel(xc + y, yc + x, 7);
	putpixel(xc - y, yc - x, 7);
	putpixel(xc + y, yc - x, 7);
	putpixel(xc - y, yc + x, 7);
}