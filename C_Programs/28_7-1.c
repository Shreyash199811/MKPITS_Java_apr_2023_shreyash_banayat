//28 7 vowel or consonant without return type and arguments
#include<stdio.h>
#include<conio.h>

void charCheck()
{
	char character;
	printf("Enter Characters in Upper Case=");
	scanf("%c",&character);
	if(character=='A' || character=='E' ||character=='I' || character=='O' || character=='U')
	{
		printf("The entered character is a Vowel");
	}
	else
	{
		printf("Entered Character is a Consonant");
	}
}
void main()
{
	charCheck();
	getch();
}
