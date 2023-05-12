//28 4 without return type and arguments
#include<stdio.h>
#include<conio.h>
 
void area()
{
	float areaOfCircle,r,pie=3.14;
	printf("Enter the radius of the circle =");
	scanf("%f",&r);
	areaOfCircle=r*r*pie;
	printf("Area of Circle =%f",areaOfCircle);
}

void main()
{
	area();
	getch();
}
