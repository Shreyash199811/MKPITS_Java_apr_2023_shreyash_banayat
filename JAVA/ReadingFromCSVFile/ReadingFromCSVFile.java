import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromCSVFile {
    public static void reading() throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new FileReader("C:\\Java\\ReadIngFromCSVFile\\Sample-Spreadsheet-10-rows.csv"));
        String content= bufferedReader.readLine();


        while(content!=null){
            String[] rows=content.split(",");
            for(int iterator=0;iterator<rows.length;iterator++){
                System.out.print(rows[iterator]+"\t\t\t");
            }
            content=bufferedReader.readLine();
            System.out.println("");
        }
    }
}
