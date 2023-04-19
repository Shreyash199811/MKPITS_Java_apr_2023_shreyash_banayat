//Count positive & negative
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int num1,num2,num3,num4,num5,negCount=0,posCount=0;
	printf("\nEnter any 5 numbers =");
	scanf("%d%d%d%d%d",&num1,&num2,&num3,&num4,&num5);
	if(num1>=0)
	{
	posCount++;
	}
	else
	{
	negCount++;
	}
	if(num2>=0)
	{
	posCount++;
	}
	else
	{
	negCount++;
	}
	if(num3>=0)
	{
	posCount++;
	}
	else
	{
	negCount++;
	}
	if(num4>=0)
	{
	posCount++;
	}
	else
	{
	negCount++;
	}
	if(num5>=0)
	{
	posCount++;
	}
	else
	{
	negCount++;
	}
	printf("Positive number Count=%d",posCount);
	printf("\nNegative number Count=%d",negCount);
	getch();
}