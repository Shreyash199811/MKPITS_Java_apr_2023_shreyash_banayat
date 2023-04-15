//Percentage
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	float totalMarks,marksGained,percentage;
	printf("Enter the Total marks =");
	scanf("%f",&totalMarks);
	printf("Enter the Marks Obtained =");
	scanf("%f",&marksGained);
	percentage=marksGained/totalMarks *100;
	printf("The Percentage are %f%",percentage);
	getch();
}