//25 Pyramid 1
#include<stdio.h>
#include<conio.h>
int main()
{
//	clrscr();
	int r,c;
	for(r=0;r<=4;r++)
	{
		for(c=0;c<=r-1;c++)
		{
		printf("%d",r);
		}
	printf("\n");
	}
	getch();
}
