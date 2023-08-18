public class ThreadedSend extends Thread{
    private String msg;
    Sender sender;
    ThreadedSend(String m,Sender obj){
        msg=m;
        sender=obj;
    }

    @Override
    public void run() {
        sender.send(msg);
    }

    //    public void run(){
//        synchronized (sender) {
//            Sender.send(msg);
//        }

}
