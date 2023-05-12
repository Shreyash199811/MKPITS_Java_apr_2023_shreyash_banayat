//28 7 Vowel or consonant without return type and with argument
#include<stdio.h>
#include<conio.h>

void charCheck(char character)
{
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
	charCheck('E');
	getch();
}
