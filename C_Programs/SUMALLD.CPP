//Addition of all numbers in a digit
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int num,sum=0,a;
	printf("Enter any 5 dogit number=");
	scanf("%d",num);
	sum=num%10;
	num=num/10;

	sum=sum+(num%10);
	num=num/10;
	sum=sum+(num%10);
	num=num/10;
	sum=sum+(num%10);
	num=num/10;
	sum=sum+(num%10);
	num=num/10;
	sum=sum+(num%10);

	printf("Sum of number is=%d",sum);
	getch();
}
