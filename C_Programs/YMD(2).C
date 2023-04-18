//Years months and days
#include<stdio.h>
#include<conio.h>
void main()
{
	int days,years,months;
	printf("\nEnter number of days=");
	scanf("%d",&days);

	years=days/365;
	days=days%365;

	months=days/30;
	days=days%30;

	printf("\nYears=%d",years);
	printf("\nMonths=%d",months);
	printf("\nDays=%d",days);
	getch();
}