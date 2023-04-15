//Lateral Surface Area of Cylinder
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int r,h;
	float curvedArea,pi=3.142;
	printf("Enter the radius of Cylinder=");
	scanf("%d",&r);
	printf("Enter the height of Cylinder=");
	scanf("%d",&h);
	curvedArea=2*pi*r*h;
	printf("The Lateral or Curved surface area of cylinder is %f",curvedArea);
	getch();
}