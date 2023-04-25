//Pyramid 25 2
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int r,c;
	char alp='A';

	for(r=1;r<=4;r++)
	{
	for(c=0;c<=r-1;c++)
	{
	printf("%c",alp);
	alp++;
	}
	printf("\n");
	}
	getch();
}