//Volume of Cone
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int r,h;
	float volume,pi=3.142;
	printf("Enter the value of radius and height of cone=");
	scanf("%d%d",&r,&h);
	volume=r*r*h*pi*1/3;
	printf("The volume of Cone =%f",volume);
	getch();
}