//Addition of all numbers in a digit
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int num,sum,sum1,sum2,sum3,sum4,sum5;
	printf("Enter any 5 dogit number=");
	scanf("%d",&num);
	sum1=num%10;
	num=num/10;

	sum2=num%10;
	num=num/10;

	sum3=num%10;
	num=num/10;

	sum4=num%10;
	num=num/10;

	sum5=num%10;
//	num=num/10;
//	sum=sum+(num%10);
	sum=sum1+sum2+sum3+sum4+sum5;

	printf("Sum of number is=%d",sum);
	getch();
}
