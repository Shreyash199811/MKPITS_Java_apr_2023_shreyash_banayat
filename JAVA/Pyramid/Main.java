import java.util.Scanner;

public class Main {
    Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        Service service=new Service();
        service.SwitchService();

        PatternTwo patternTwo=new PatternTwo();
        patternTwo.patternLowerRight();

        PatternOne patternOne=new PatternOne();
        patternOne.patternDiamond();

        PatternThree patternTree=new PatternThree();
        patternTree.patternInversePyramid();

        PatternFour patternFour=new PatternFour();
        patternFour.patternTriangle();

        PatternFive patternFive=new PatternFive();
        patternFive.patternFive();

        PatternSix patternSix=new PatternSix();
        patternSix.patternSix();
    }
}