//Perimeter and Area of Circle
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int r=6;
	float pi=3.142,area,perimeter;
	perimeter=2*r*pi;
	printf("The perimeter of the Circle is %f",perimeter);
	area=r*r*pi;
	printf("\nThe area of The Circle is %f",area);
	getch();
}
