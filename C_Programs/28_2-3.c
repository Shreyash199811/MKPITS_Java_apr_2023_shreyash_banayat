//28 2 with return type & no arguments
#include<stdio.h>
#include<conio.h>

int maximum()
{
	int num1,num2,max;
	printf("Enter the first no.");
	scanf("%d",&num1);
	printf("Enter the second no.");
	scanf("%d",&num2);
	
	if(num1>num2){
		max=num1;
	}else
	{
		max=num2;
	}
	return max;
}

int main(){
	printf("The maximum number is %d",maximum());
	getch();
}
