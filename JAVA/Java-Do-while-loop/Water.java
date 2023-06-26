public class Water{
    boolean hasWater=true;
    public void Bottle(){
        do{
            System.out.println("Pour");
        }while(hasWater==!hasWater);
        System.out.println("Stop pouring");
    }

}
