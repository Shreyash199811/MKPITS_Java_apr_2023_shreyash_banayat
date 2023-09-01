public interface Shape {

    public void calArea();

    default void shapeColor(){
        System.out.println("Black");
    }

    static void display(String shapeName){
        System.out.println("Shape is "+shapeName);
    }

}
