//Reverse
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int num,rem,reverse;
	printf("Enter the 5  number=");
	scanf("%d",&num);
	rem=num%10;
	num=num/10;
	reverse=rem;

	rem=num%10;
	num=num/10;
	printf("\nreverse1=%d",reverse);
	reverse=(reverse*10)+rem;

	rem=num%10;
	num=num/10;
	printf("\nreverse2=%d",reverse);
	reverse=(reverse*10)+rem;

	rem=num%10;
	num=num/10;

	printf("\nreverse3=%d",reverse);
	reverse=(reverse*10)+rem;

	rem=num%10;
	num=num/10;
	printf("\nreverse4=%d",reverse);
	reverse=(reverse*10)+rem;

	rem=num%10;
	printf("\nreverse5=%d",reverse);
	reverse=(reverse*10)+rem;

	printf("\nReverse is =%d",reverse);
	getch();
}