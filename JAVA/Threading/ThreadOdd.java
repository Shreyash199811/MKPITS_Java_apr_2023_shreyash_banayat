public class ThreadOdd implements  Runnable{
    @Override
    public void run() {
        for(int i=1;i<=100;i++){
            if(i%2==1){
                System.out.println("Odd "+i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
