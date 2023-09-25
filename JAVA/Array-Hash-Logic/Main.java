import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] intArray=new int[10];

        Scanner scan =new Scanner((System.in));
        int value;

        for(int iterator=0;iterator<intArray.length;iterator++){
            System.out.println("Enter a value="+iterator+"=>");
            value=scan.nextInt();
            intArray[value%10]=value;
        }
        System.out.println("Array=>");
        for(int iterator=0;iterator<intArray.length;iterator++){
            System.out.print(intArray[iterator]+"\t");
        }

        int counter=0;
        for(int iterator=0;iterator<intArray.length;iterator++){
            if(intArray[iterator]!=0){
                counter++;
            }
        }
        double loadFactor= (double) counter /intArray.length;
        System.out.println("Load Factor="+loadFactor);

          int[] newArray=new int[counter];
          for(int iterator=0,newIterator=0;iterator<intArray.length;iterator++){
            if(intArray[iterator]!=0){
                newArray[newIterator]=intArray[iterator];
                newIterator++;
            }
        }

        System.out.println("New Array=>");
        for(int iterator=0;iterator<newArray.length;iterator++){
            System.out.print(newArray[iterator]+"\t");
        }
//        Arrays.copyOf(intArray,6);
//        System.out.println("Array=>");
//        for(int iterator=0;iterator<newArray.length;iterator++){
//            System.out.print(intArray[iterator]+"\t");
//        }
    }
}