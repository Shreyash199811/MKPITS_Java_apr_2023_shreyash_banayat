//Swapping two variable (method 2)
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int a,b,c;
	printf("Enter two variable=");
	scanf("%d%d",&a,&b);
	printf("a=%d\n",a);
	printf("b=%d\n",b);
	c=a;
	a=b;
	b=c;
	printf("a=%d\n",a);
	printf("b=%d\n",b);
	getch();
}
