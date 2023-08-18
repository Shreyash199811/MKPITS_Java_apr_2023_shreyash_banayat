import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f = new File("C:\\Java\\Files", "Files.iml");
        System.out.println(f.exists());

        File fn = new File("D:\\Project_html\\index _page");
        File fil = new File("C:\\MyJavaPrograms");

        File fi = new File(fil, "MyProject-Interface");
        System.out.println(fi.exists());

        int compareFile = fn.compareTo((fil));
        System.out.println(compareFile);

        File filePath=new File("C:\\Java\\Files");
        System.out.println(filePath.isFile());

        String[] fileNames=fn.list();
        for(String file:fileNames){
            System.out.println(file);
        }



    }
}