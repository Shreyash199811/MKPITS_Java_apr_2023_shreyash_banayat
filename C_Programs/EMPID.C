//Employee Salary
#include<stdio.h>
#include<conio.h>
void main()
{
	clrscr();
	int empId,totalWorkedHour;
	float ampperHour,salary;
	printf("Enter employee Id=");
	scanf("%d",&empId);
	printf("Enter total working hours=");
	scanf("%d",&totalWorkedHour);
	printf("Amount received per hours=");
	scanf("%f",&ampperHour);
	printf("Employee ID=%d",empId);
	salary=totalWorkedHour*ampperHour;
	printf("\nSalary=%.2f",salary);
	getch();
}
