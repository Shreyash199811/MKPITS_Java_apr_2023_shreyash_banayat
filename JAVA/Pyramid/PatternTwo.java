import java.util.Scanner;

public class PatternTwo{
    Scanner scanner=new Scanner(System.in);
    public void patternLowerRight() {
        System.out.println("Enter number of rows=");
        int rows=scanner.nextInt();
        for (int row=0; row<=rows; row++) {
            for(int column=1;column<=rows-row;column++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
