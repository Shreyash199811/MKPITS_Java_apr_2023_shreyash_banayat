//Password
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int pw;
	printf("Enter the Password=");
	scanf("%d",&pw);
	if(pw==1234)
	{
	printf("\nCorrect Password");
	}
	else
	{
	printf("\nIncorrect password");
	}
	getch();
}
