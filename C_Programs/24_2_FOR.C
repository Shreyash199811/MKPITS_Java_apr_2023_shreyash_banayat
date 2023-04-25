//Matrix for row no. print in for loop
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int row=4,column=4;

	for(int r=1;r<=row;r++)
	{
		for(int c=1;c<=column;c++)
		{

		printf("%d",r);
		}

	printf("\n");
	}
	getch();
}