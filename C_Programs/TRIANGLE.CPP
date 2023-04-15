//Area of Triangle
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int b,h;
	float area;
	printf("Enter the base and height of triangle=");
	scanf("%d%d",&b,&h);
	area= b*h*1/2;		    // area=1/2*b*h
	printf("Area of the triangle is %f",area);
	getch();
}