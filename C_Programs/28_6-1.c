//28 6 Square of a number without return type and arguments
#include<stdio.h>
#include<conio.h>

void Square()
{
	int num,square;
	printf("Enter the number =");
	scanf("%d",&num);
	square=num*num;
	printf("The Square of the number is =%d",square);
}

void main()
{
	Square();
	getch();
}
