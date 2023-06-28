import java.util.Scanner;

public class PatternFive{
    Scanner scanner=new Scanner(System.in);

    public void patternFive(){
        System.out.println("Enter number of rows=");
        int rows=scanner.nextInt();

        for(int row=rows;row>=1;row--){
            for(int space=rows;space>row;space--){
                System.out.print(" ");
            }
            for(int star=1;star<=row;star++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
        for(int row=1;row<=rows;row++){
            for(int space=row;space<=rows;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=row;star++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }

}
