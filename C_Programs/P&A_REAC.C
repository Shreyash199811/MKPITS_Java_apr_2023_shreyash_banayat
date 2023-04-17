//Perimeter and Area of rectangle
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int height=7,width=5;
	float perimeter,area;
	perimeter=2*(height+width);          //perimeter of reactangle=2(l+b)
	printf("The Perimeter of Rectangle =%f",perimeter);
	area=(height*width);		   //area of rectangle
	printf("\nThe area of Ractangle =%f",area);
	getch();
}