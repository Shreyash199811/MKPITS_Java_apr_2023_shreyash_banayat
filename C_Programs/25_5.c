//Pyramid 25 5
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int r,c;
	for(r=1;r<=5;r++)
	{
		for(c=1;c<=6-r;c++)
		{
			printf("%d",c);
		}
		printf("\n");
	}
	getch();
}
