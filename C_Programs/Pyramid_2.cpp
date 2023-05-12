//Pyramid 2
#include<stdio.h>
#include<conio.h>

int main()
{
	int a,b,c;
	
	for(a=1;a<=5;a++)
	{
		for(b=1;b<40-a;b++)
		{
			printf(" ");
		}
		for(c=1;c<=a;c++)
		{
			printf("%d",c);
		}
		printf("\n");
	}
	getch();
}
