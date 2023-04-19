//Read 5 num and Sum of odd values
#include<stdio.h>
#include<conio.h>
void main()
{
	int num1,num2,num3,num4,num5,odd,sum=0;
	printf("\nEnter any 5 numbers =");
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
	printf("Sum of odd numbers is %d",sum);
	getch();
	}

