//Calculation of force
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	float m,a,force;
	printf("Enter the value of Mass=");
	scanf("%f",&m);
	printf("Enter the value 0f acceleration=");
	scanf("%f",&a);
	force=m*a;
	printf("The value of force is %f",force);
	getch();
}