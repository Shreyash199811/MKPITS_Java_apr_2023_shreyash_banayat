//28 2 with return type and argument
#include<stdio.h>
#include<conio.h>
 int maximum();
 
 void main()
 {
 	int no1,no2;
 	printf("Enter the value of two numbers =");
 	scanf("%d%d",&no1,&no2);
 	printf("The maximum of two values is %d",maximum(no1,no2));
 	getch();
 }
 
 int maximum(int num1,int num2)
 {
 	int max;
 	if(num1>num2){
 		max=num1;
	 }
	 else{
	 	max=num2;
	 }
	 return max;
 }
