public class Circles{
    int rounds=0;
    int counter=0;
  public void roundsAroundTemple(){
      do{
          System.out.println("Keep Walking "+counter++);
          rounds++;
      }while(rounds<=108);
      System.out.println("Stop");
  }
}
