import java.util.Scanner;

public class PatternFour {
    Scanner scanner=new Scanner(System.in);

    public void patternTriangle(){
        System.out.println("Enter number of rows=");
        int rows=scanner.nextInt();

        for(int row=0;row<=rows;row++){
            for(int column=1;column<=row;column++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int row=rows-1;row>=1;row--){
            for(int column=1;column<=row;column++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
