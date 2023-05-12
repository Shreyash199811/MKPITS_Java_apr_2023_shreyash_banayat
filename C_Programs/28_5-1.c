//28 5 Area of triangle without return type and arguments
#include<stdio.h>
#include<conio.h>

void AreaOfTriangle()
{

	float b,h,area;
	printf("Enter the value of base and height=");
	scanf("%f%f",&b,&h);
	area=b*h*1/2;
	printf("The area of triangle is %f",area);
}

int main()
{
	AreaOfTriangle();
	getch();
}
