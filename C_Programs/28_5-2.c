//25 5 Area of Triangle without return type and with arguments
#include<stdio.h>
#include<conio.h>

void AreaOfTriangle(float b,float h)
{

	float area;
	area=b*h*1/2;
	printf("The area of triangle is %f",area);
}

int main()
{
	AreaOfTriangle(5,10);
	getch();
}
