//Number in Range
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int number;
	printf("\nEnter any number=");
	scanf("%d",&number);
	if(number>=80||number<0)
	{
	printf("Error:Number is out of range");
	}
	getch();
}
