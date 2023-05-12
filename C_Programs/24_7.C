#include<stdio.h>
#include<conio.h>
int main()
{
//	clrscr();
//	int r;
	char r,c;

	for(r='E';r>='A';r--)
	{
	if(r=='C'){
	r--;
	}
		for(c='A';c<='E';c++)
		{
		printf("%c",r);
		}
	printf("\n");
	}
	getch();
}
