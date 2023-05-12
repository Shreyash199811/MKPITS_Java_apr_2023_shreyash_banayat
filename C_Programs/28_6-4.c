//28 6 Square of a number with return type and with argument
#include<stdio.h>
#include<conio.h>

int Square(int num)
{
	int square;
	square=num*num;
	return square;
}

int main()
{
	printf("The square of the number is =%d",Square(6));	
	getch();
}
