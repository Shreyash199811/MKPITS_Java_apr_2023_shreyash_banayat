import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<Integer,String> sortedMap=new HashMap<>();
        sortedMap.put(11,"Abhay");
        sortedMap.put(14,"Chaturvedi");
        sortedMap.put(12,"Ganesh");
        sortedMap.put(10,"Brijesh");
        sortedMap.put(44,"hutch");

        ServiceMethods serviceMethods=new ServiceMethods();
        serviceMethods.writeObjectToFile(sortedMap);
        serviceMethods.readObjectFromFile();
    }
}