
#include<stdio.h>
#include<conio.h>
void main()
{
	int row=3,column=5;
	clrscr();
	int r=0;
	do
	{
	int c=0;
		do
		{
		printf("*");
		c++;
		}while(c<column);
	printf("\n");
	 r++;
	}while(r<row);
	getch();
}