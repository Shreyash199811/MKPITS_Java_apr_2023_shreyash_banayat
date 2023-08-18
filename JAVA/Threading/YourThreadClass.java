public class YourThreadClass extends Thread{
    int sum=0;
    public void run(){
        synchronized (this){
            for(int i=0;i<=10;i++){
                sum=sum+i;
            }
            notify();
      }
    }
}
