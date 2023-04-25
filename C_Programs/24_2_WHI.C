//Matrix with while loop(2)
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int row=4,column=4;

	int r=1;
	while(r<=row)
	{
	int c=1;

		while(c<=column)
		{
		printf("%d",r);
		c++;
		}
	printf("\n");
	r++;
	}
	getch();
}