#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int r,h;
	float pi=3.142,volume;
	printf("Enter the radius and height of the cylinder");
	scanf("%d\t%d",&r,&h);
	volume=pi*r*r*h;
	printf("The volume of cylinder is %f",volume);
	getch();
}