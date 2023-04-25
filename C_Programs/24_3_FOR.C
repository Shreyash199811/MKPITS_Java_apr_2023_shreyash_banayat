//Matrix with for loop (3)
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int row=3,column=5;

	for(int r=1;r<=row;r++)
	{
		for(int c=1;c<=column;c++)
		{
		printf("%d",c);
		}
		printf("\n");
	}
	getch();
}
