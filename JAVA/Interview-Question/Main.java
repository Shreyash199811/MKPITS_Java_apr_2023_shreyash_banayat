import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] patientAge=new int[20];
        int totalIncome=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the age of patients visited ");
        int age ;

        for(int iterator=0;iterator<patientAge.length;iterator++){
            age = scanner.nextInt();
            if(age>0 && age<=120){
                if(age<17){
                    patientAge[iterator]=age;
                    totalIncome=totalIncome+400;
                } else if (age>=17 && age <=40) {
                    patientAge[iterator]=age;
                    totalIncome=totalIncome+300;
                } else if (age>40) {
                    patientAge[iterator]=age;
                    totalIncome=totalIncome+200;
                }
            }
            else{
                break;
            }
        }
        System.out.println("Total Income "+totalIncome+" INR");
    }
}