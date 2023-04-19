//Sum of odd numbers
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int num1,num2,num3,num4,num5,sum=0;
	printf("\nEnter the 5 numbers =");
	scanf("%d%d%d%d%d",&num1,&num2,&num3,&num4,&num5);
	if(num1%2==1)
	{
	sum=sum+num1;
	}
	if(num2%2==1)
	{
	sum=sum+num2;
	}
	if(num3%2==1)
	{
	sum=sum+num3;
	}
	if(num4%2==1)
	{
	sum=sum+num4;
	}
	if(num5%2==1)
	{
	sum=sum+num5;
	}
	printf("sum of all odd no. is %d",sum);
	getch();
}