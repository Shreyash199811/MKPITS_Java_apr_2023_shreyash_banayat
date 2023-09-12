import java.io.*;
import java.util.HashMap;

public class ServiceMethods {
    public void writeObjectToFile(HashMap hashMap) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("hashmapObjects.txt"));
        oos.writeObject(hashMap);
        oos.close();
    }

    public void readObjectFromFile(){
        try {
            ObjectInputStream objectInputStream=new
                    ObjectInputStream(new FileInputStream("hashmapObjects.txt"));
        HashMap newHashMap= (HashMap) objectInputStream.readObject();
            System.out.println(newHashMap);

        } catch (IOException e) {
            e.getMessage();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
