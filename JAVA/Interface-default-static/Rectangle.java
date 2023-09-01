public class Rectangle implements Shape{
    float length,breadth,area;
    @Override
    public void calArea() {
        length=20.01f;
        breadth=10.0f;
        area=length*breadth;
        System.out.println("Area of Rectangle="+area);
    }

    @Override
    public void shapeColor() {
        Shape.super.shapeColor();
    }


}
