//25 7
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	char r;
	int c;
	for(r='E';r>='A';r--)
	{
		for(c='A';c<=r;c++)
		{
			printf("%c",r);
		}
		printf("\n");
	}
	getch();
}
