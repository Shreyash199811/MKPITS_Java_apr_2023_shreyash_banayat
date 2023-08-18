import java.util.Random;

public class RandomNUmber implements Runnable {
    Random random=new Random();
    int number;
    @Override
    public void run() {
       for(int i=1;i<=10;i++){
           System.out.println(random.nextInt(10000));
       }
    }
}
