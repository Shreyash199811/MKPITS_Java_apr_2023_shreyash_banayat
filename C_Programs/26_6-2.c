//28 6 Square of a number without return type and with arguments
#include<stdio.h>
#include<conio.h>

int Square()
{
	int num,square;
	printf("Enter the number =");
	scanf("%d",&num);
	square=num*num;
	return square;
}

int main()
{
	printf("The square of the number is =%d",Square());
	
	getch();
}
