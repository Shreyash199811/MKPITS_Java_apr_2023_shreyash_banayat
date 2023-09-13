interface Shape{
    public void calArea(int radius);
}

//class Circle{
//    public Circle(Shape shapeObj){
//        shapeObj.calArea();
//    }
//}
public class Main {
    public static void main(String[] args) {
//        Circle circle=new Circle(new Shape(){
//            @Override
//            public void calArea() {
//                System.out.println("This is Anonymous class");
//            }
//        });

//        Lambda Function
         Shape shape=(r) -> {
             System.out.println("area of Circle is="+((Math.PI)*r*r));
         };
         shape.calArea(5);
    }
}