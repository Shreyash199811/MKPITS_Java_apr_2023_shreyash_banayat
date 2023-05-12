//28 5 Area of triangle with return type and with arguments
#include<stdio.h>
#include<conio.h>

float AreaOfTriangle(float b,float h)
{
	float area;
	area=b*h*1/2;
	return area;
}

void main()
{
	printf("Area of Triangle is %f",AreaOfTriangle(5,10));
	getch();
}
