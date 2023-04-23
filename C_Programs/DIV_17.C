//sum of nos. not divisible by 17 in a range
#include<stdio.h>
#include<conio.h>
void main()
{
	int min, max,sum=0;
	printf("Enter min number of the range =");
	scanf("%d",&min);
	printf("Enter max number of the range=");
	scanf("%d",&max);
	for(int i=min;i<=max;i++)
	{
	if(i%17!=0)
	{
	sum=sum+i;
	}
	}
	printf("Sum =%d",sum);
	getch();
}
