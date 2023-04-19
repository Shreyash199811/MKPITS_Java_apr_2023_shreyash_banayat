//Average of Positive numbers
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int num1,num2,num3,num4,num5,avg,posCount=0,sum=0;
	printf("\nEnter any 5 integers =");
	scanf("%d%d%d%d%d",&num1,&num2,&num3,&num4,&num5);
	if(num1%2==0)
	{
	posCount++;
	sum=sum+num1;
	}
	if(num2%2==0)
	{
	posCount++;
	sum=sum+num2;
	}
	if(num3%2==0)
	{
	posCount++;
	sum=sum+num3;
	}
	if(num4%2==0)
	{
	posCount++;
	sum=sum+num4;
	}
	if(num5%2==0)
	{
	posCount++;
	sum=sum+num5;
	}
	avg=sum/posCount;
	printf("Average of positive numbers is %d",avg);
	getch();
	}