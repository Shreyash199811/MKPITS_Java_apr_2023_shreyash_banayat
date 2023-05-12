//Pyramid
#include<stdio.h>
#include<conio.h>
int main()
{
	
	int h,sp,str;
//	clrscr();
	for(h=1;h<=4;h++)
	{
		for(sp=1;sp<=10-h;sp++)
		{
			printf(" ");
		}
		for(str=1;str<=h;str++)
		{
			printf(" *");
		}
		printf("\n");
	}
	getch();
}
