import java.util.Scanner;

public class PatternSix{
    Scanner scanner = new Scanner(System.in);
    int rows;

    public void patternSix() {
        System.out.println("Enter the number of lines=");
        rows = scanner.nextInt();

        for (int row = 1; row <= rows; row++) {
            for (int space = 1; space <= row; space++) {
                System.out.print(" ");
            }
            for (int column = row; column <= rows; column++) {
                System.out.print(" "+column );
            }
            System.out.println("");
        }
        for (int row =rows-1; row>=1; row--) {
            for (int space = 0; space <= row; space++) {
                System.out.print(" ");
            }
            for (int column=row; column<= rows; column++) {
                System.out.print(column+" ");
            }
            System.out.println("");
        }
    }
}
