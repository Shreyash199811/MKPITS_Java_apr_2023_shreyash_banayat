//pyramid star * 25 3
#include<stdio.h>
#include<conio.h>
int main()
{
//	clrscr();
	int r,c;
	for(r=1;r<=5;r++)
	{
		for(c=1;c<=6-r;c++)
		{
		printf("*");
		}
	printf("\n");
	}
	getch();
}
