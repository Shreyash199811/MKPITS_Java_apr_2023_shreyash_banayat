import java.util.Scanner;
public class PatternOne{
    Scanner scanner=new Scanner(System.in);
    int rows;
    public void patternDiamond(){
        System.out.println("Enter number of rows=");
        int rows=scanner.nextInt();
        for(int row=1;row<=rows;row++){
            for(int space=rows;space>row;space--){
                System.out.print(" ");
            }
            for(int star=1;star<=(2*row-1);star++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int row=rows-1;row>=1;row--){
            for(int space=rows;space>row;space--){
                System.out.print(" ");
            }
            for(int star=1;star<=(2*row-1);star++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
