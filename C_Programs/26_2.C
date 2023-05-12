//26 2
#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int r,sp,str;
for(r=65;r<=67;r++)
{
	for(sp=1;sp<=80-r;sp++)
	{
	printf(" ");
	}
	for(str=1;str<=3;str++)
	{
	printf(" %c",r);
	}
	printf("\n");
}
	getch();
}