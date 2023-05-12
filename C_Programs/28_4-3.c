//28 4 with return type and without arguments
#include<stdio.h>
#include<conio.h>

float area()
{
	float areaOfCircle,r,pie=3.14;
	printf("Enter the radius of the circle =");
	scanf("%f",&r);
	areaOfCircle=r*r*pie;
	
	return areaOfCircle;
}

void main()
{
	printf("Area of the Circle is %f",area());
	getch();
}
