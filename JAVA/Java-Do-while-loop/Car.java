public class Car {
    private int noOfSeats;
    public void CarSeats(){
        do{
            System.out.println("Can sit");
            noOfSeats++;
        }while(noOfSeats<9);
        System.out.println("car is full");
    }
}
