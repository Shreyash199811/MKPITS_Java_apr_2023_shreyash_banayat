#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int speed,distance,time;
	printf("Enter the value for distance covered");
	scanf("%d",&distance);
	printf("Enter the time");
	scanf("%d",&time);
	speed=distance/time;
	printf("The speed is %d m/s",speed);
	getch();
}