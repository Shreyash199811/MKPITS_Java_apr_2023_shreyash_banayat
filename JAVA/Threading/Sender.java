public class Sender {
    public void send(String msg){
        synchronized(this) {
            System.out.println("Sending " + msg);
            System.out.println("Send " + msg);
        }
    }
}
