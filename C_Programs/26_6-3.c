//28 6 Square of a number with return type and without arguments
#include<stdio.h>
#include<conio.h>

void Square(int num)
{
	int square;
	square=num*num;
	printf("The square of the number is =%d",square);	
}

int main()
{
	Square(6);
	getch();
}
