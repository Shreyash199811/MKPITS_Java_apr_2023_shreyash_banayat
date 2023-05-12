//25 8
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int r,c;
	for(r=1;r<=5;r++)
	{
		for(c=5;c>=r;c--)
		{
		printf("%c",65-1+c);
		}
		printf("\n");
	}
}
