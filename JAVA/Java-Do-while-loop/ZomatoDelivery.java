public class ZomatoDelivery {
    boolean isFoodReady=true;

    public void getOrderStatus() {
        do{
            System.out.println("Your food is being prepared...");
        }while(!(isFoodReady));
    }
}
