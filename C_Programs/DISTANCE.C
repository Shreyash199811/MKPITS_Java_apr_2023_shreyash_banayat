//Distance Between two points
#include<stdio.h>
#include<conio.h>
void main()
{
	int x1,x2,y1,y2;
	float distanceSqu,distance;
	printf("\nEnter the value of x1 and y1=");
	scanf("%d%d",&x1,&y1);
	printf("\nEnter the value of x2 and y2=");
	scanf("%d%d",&x2,&y2);
	distanceSqu=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));

	getch();
}




