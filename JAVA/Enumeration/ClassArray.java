public class ClassArray {

    public void method(int[] arry){
        try {
            for(int i=0;i<= arry.length;i++){
                System.out.println(arry[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Array has "+arry.length+" elements.");
        }
    }

    public void display(){
        System.out.println("Just next step after error handling");
    }
}
