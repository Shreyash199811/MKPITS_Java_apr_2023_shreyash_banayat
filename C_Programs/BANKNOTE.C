//Smallest Possible Bank Notes
#include<stdio.h>
#include<conio.h>
void main()
{
	int amount,noOfNotes;
	printf("\nEnter the amount =");
	scanf("%d",&amount);
//	Taking smallest Bank Notes be 10Rs
	noOfNotes=amount/10;
	printf("\nNumber of notes received =%d",noOfNotes);
	getch();
}
