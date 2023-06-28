//26 1
#include<stdio.h>
#include<conio.h>
int main()
{
//clrscr();
int r,sp,str;
for(r=1;r<=3;r++)
{
	for(sp=1;sp<=20-r;sp++)
	{
	printf(" ");
	}
	for(str=1;str<=r;str++)
	{
	printf(" %d",str);
	}
	printf("\n");
}
	getch();
}
