#include<stdio.h>
#include<conio.h>
void main()
{       clrscr();
	int side,volume;
	printf("Enter the side of the cube=");
	scanf("%d",&side);
	volume=side*side*side;
	printf("Volume of cube is %d ",volume);
	getch();
}