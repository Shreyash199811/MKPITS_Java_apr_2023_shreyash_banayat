//Matrix 24 10
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int r;
	char c;
	for(r=1;r<=5;r++)
	{
		for(c='E';c>='A';c--)
		{
		printf("%c",c);
		}
	printf("\n");
	}
	getch();
}