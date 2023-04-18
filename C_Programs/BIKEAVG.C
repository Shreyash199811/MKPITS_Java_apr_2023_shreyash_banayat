//bike Average
#include<stdio.h>
#include<conio.h>
void main()
{
	int disTravel;
	float fuel,average;
	printf("\nEnter the distance traveled=");
	scanf("%d",&disTravel);

	printf("\nTotal fuel used =");
	scanf("%f",&fuel);

	average=disTravel/fuel;
	printf("\nThe bike's average is %.2f",average);
	getch();
}

