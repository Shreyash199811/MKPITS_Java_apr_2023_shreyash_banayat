#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int r;
	float area,pi=3.142;
	printf("Enter the value of radius to calculate the area: ");
	scanf("%d",&r);
	area=r*r*pi;
	printf("Area of circle is %f",area);
	getch();
}