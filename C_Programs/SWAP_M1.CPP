//Swapping two variables  (method 1)
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int a,b;
	printf("Enter two variable a & b =");
	scanf("%d%d",&a,&b);
	printf("a=%d\n",a);
	printf("b=%d\n",b);
	a=a-b;
	b=a+b;
	a=b-a;
	printf("a=%d\n",a);
	printf("b=%d",b);
	getch();
}