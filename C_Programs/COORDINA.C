//Give Quadrant using Cartesian co-ordinates
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	float x,y;
	printf("\nEnter the x and y co-ordinates respectively.\nx=");
	scanf("%f",&x);
	printf("\ny=");
	scanf("%f",&y);

	if(x>0 && y>0)
	{
	printf("\nThe coordinates belongs to Quadrant-I");
	}
	if(x<0 && y>0)
	{
	printf("\nThe Coordinates belongs to Quafdrant-II");
	}
	if(x<0 && y<0)
	{
	printf("\nThe coordinates belongs to Quadrant-III");
	}
	if(x>0 && y<0)
	{
	printf("\nThe coordinates  belongs to Quadrant-IV");
	}
	if(x==0 && y==0)
	{
	printf("\nThe coordinates is of Origin");
	}
	getch();
	}
