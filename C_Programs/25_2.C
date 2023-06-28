// triangle-25-2
#include<stdio.h>
#include<conio.h>
int main()
{
	char r,c;
//	clrscr();
	for(r='A';r<='D';r++)
	{
		for(c='A';c<=r;c++)
		{
		printf("%c",c);
		}
	printf("\n");
	}
	getch();
}
