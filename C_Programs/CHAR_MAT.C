//Matrix with for loop
#include<stdio.h>
#include<conio.h>
void main()
{
	int row=4,column=5;
	for(int r=0;r<row;r++)
	{
	if(r==0)
	{
	printf("A");
	}
	if(r==1)
	{
	printf("B");
	}
	if(r==2)
	{
	printf("C");
	}
	if(r==3)
	{
	printf("D");
	}

	for(int c=0;c<column;c++)
	{
	printf("\n");
	}
	}
	getch();
}
