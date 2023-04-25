//Matrix with do while(2)
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int row=4,column=4;
	int r=1;
	do
	{
	int c=1;
		do
		{
		printf("%d",r);
		c++;
		}while(c<=column);
	printf("\n");
	r++;
	}while(r<=row);
	getch();
}


