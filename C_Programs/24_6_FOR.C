#include<stdio.h>
#include<conio.h>
int main()
{
//	clrscr();
	int r;
	char c;
	for(r=1;r<=4;r++)
	{
	for(c='A';c<='E';c++)
	{
	printf("%c",c);
	}
	printf("\n");
	}
	getch();
}
