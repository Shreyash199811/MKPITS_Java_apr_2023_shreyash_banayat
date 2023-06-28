import java.util.Scanner;
public class Service{
    Scanner scanner=new Scanner(System.in);
        public void SwitchService(){
            int patternNumber;
            System.out.println("Enter the number of patter you want to print from 1, 2, 3, 4, 5, 6 \n");
            patternNumber=scanner.nextInt();

            switch(patternNumber){

                case 1:PatternOne patternOne=new PatternOne();
                        patternOne.patternDiamond();
                        break;
                case 2:PatternTwo patternTwo=new PatternTwo();
                        patternTwo.patternLowerRight();
                        break;
                case 3:PatternThree patternThree=new PatternThree();
                        patternThree.patternInversePyramid();
                        break;
                case 4:PatternFour patternFour=new PatternFour();
                        patternFour.patternTriangle();
                        break;
                case 5:PatternFive patternFive=new PatternFive();
                        patternFive.patternFive();
                        break;
                case 6:PatternSix patternSix=new PatternSix();
                        patternSix.patternSix();
                        break;
                default:System.out.println("Enter number between 1 to 6");
            }
        }
}
