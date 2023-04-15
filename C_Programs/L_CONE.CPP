//Lateral Surface Area of a Cone
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int r,l;
	float curvedArea,pi=3.142;
	printf("Enter the radius of cone=");
	scanf("%d",&r);
	printf("Enter the height of Cone=");
	scanf("%d",&l);
	curvedArea=pi*r*l;
	printf("The Lateral or Curved surface area of cone  is %f",curvedArea);
	getch();
}