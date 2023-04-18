//Convert year, week and days
#include<stdio.h>
#include<conio.h>
void main()
{

	int days,years,weeks;
	printf("\nEnter the number of days=");
	scanf("%d",&days);
	years=days/365;
	days=days%365;
	weeks=days/7;
	days=days%7;

	printf("\nThe  no. of years is =%d",years);
	printf("\nThe no. of weeks is =%d",weeks);
	printf("\nThe no. of remaining days is=%d",days);
	getch();
}
	
