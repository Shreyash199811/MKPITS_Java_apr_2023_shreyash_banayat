//Pyramid 25 6
#include<stdio.h>
#include<conio.h>
int main()
{
//	clrscr();
	char r,c;
	for(r='A';r<='E';r++)
	{
		for(c='A';c<='E'-1;c++)
		{
			printf("%c",r);
		}
		printf("\n");
	}
	getch();
}
