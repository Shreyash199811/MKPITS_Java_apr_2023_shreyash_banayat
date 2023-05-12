//28 5 Area of Triangle with return type and without arguments
#include<stdio.h>
#include<conio.h>

float AreaOfTriangle()
{

	float b,h,area;
	printf("Enter the value of base and height=");
	scanf("%f%f",&b,&h);
	area=b*h*1/2;
	return area;
}

int main()
{
	printf("Area of Triangle is %f",AreaOfTriangle());
	getch();
}

