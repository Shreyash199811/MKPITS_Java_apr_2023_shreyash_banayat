//Enter p q r s ,p is even,r and s are +ve, q>r,s>p. r+s>p+q then print correct values otherwise wrong values
#include<stdio.h>
#include<conio.h>
void main()
{
	int p,q,r,s;
	printf("\nEnter 4 variables =");
	scanf("%d%d%d%d",&p,&q,&r,&s);
	if((p%2==0) && (r>0)&&(s>0) && (q>r && s>p) && (r+s)>(p+q))
	{
	printf("Correct values");
	}
	else
	{
	printf("Wrong values");
	}
	getch();
}