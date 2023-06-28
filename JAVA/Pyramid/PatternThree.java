import java.util.Scanner;

public class PatternThree {
        Scanner scanner=new Scanner(System.in);
        public void patternInversePyramid(){
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
        }
}
