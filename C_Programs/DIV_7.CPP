//find numbers in a range which after divide by 7 reminder is 2 or 3
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int minNum,maxNum,rem,num;
	printf("\nEnter the minimum value of the range=");
	scanf("%d",&minNum);
	printf("Enter the maximum value of the range=");
	scanf("%d",&maxNum);
	printf("The numbers are ");

	for(int count=minNum;count<=maxNum;count++)
	{
	if(count%7==2 || count%7==3)
	{
	printf("%d\t",count);
	}
	}
	getch();
}