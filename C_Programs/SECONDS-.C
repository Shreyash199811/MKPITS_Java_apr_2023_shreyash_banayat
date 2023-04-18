//Seconds to hours minutes and seconds
#include<stdio.h>
#include<conio.h>
void main()
{
	int sec,hours,mins;
	printf("\nEnter the number of seconds=");
	scanf("%d",&sec);
	hours=sec/3600;
	sec=sec%3600;

	mins=sec/60;
	sec=sec%60;

	printf("\nHours=%d",hours);
	printf("\nMinutes=%d",mins);
	printf("\nSeconds=%d",sec);
	getch();
}