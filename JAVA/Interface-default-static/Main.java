public class Main {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        rectangle.calArea();
        rectangle.shapeColor();
        Shape.display("rectangle");

        Circle circle=new Circle();
        circle.calArea();
        circle.shapeColor();
        Shape.display("circle");

    }
}