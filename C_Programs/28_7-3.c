//28 7 vowel & Consonant with return type and without argument
#include<stdio.h>
#include<conio.h>

int charCheck()
{
	char character;
	int ret;
	printf("Enter Characters in Upper Case=");
	scanf("%c",&character);
	if(character=='A' || character=='E' ||character=='I' || character=='O' || character=='U')
	{

	ret=	printf("The entered character is a Vowel");
	}
	else
	{

	ret=	printf("Entered Character is a Consonant");
	}
	return ret;
}
void main()
{
	printf("Entered Character is a %s",charCheck());
	getch();
}
