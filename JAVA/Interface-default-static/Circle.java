public class Circle implements Shape{

    float area,radius=5;
    @Override
    public void calArea() {
        area=(float)(Math.PI*(radius*radius));
        System.out.println("Area of Circle="+area);
    }

    @Override
    public void shapeColor() {
        Shape.super.shapeColor();
        System.out.println("red");
    }
}
