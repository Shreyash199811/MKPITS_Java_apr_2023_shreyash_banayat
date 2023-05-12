//Pyramid 25 4
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int r,c;
	for(r=1;r<=6;r++)
	{
		if(r==1){
		printf("1");
		}
		for(c=1;c<=6-r;c++)
		{
		if(r==5 && c==1)
		{
		printf("1");
		}
		else{
		printf("%d",r);
	}
		}
	printf("\n");
	}
	getch();
}
