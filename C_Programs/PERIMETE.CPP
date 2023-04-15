#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int r;
	float perimeter,pi=3.142;
	printf("Enter the radius of the circle=");
	scanf("%d",&r);
	perimeter=2*pi*r;
	printf("The perimeter of the circle=%f",perimeter);
	getch();
}