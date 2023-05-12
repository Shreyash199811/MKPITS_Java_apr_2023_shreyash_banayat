//28  4  with return type and arguments
#include<stdio.h>
#include<conio.h>

float area(float r)
{
	float areaOfCircle,pie=3.14;
	areaOfCircle=pie*r*r;
	return areaOfCircle;
}

void main()
{
	float rad;
	printf("enter the radius of circle =");
	scanf("%f",&rad);
	printf("Area of circlr =%f",area(rad));
	getch();
}
