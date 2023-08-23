import java.io.*;

public class ReadFile {
    public void countLines() throws IOException {
        BufferedReader inputBuffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the file name=");
        String filename = inputBuffer.readLine();
        File file = new File(filename);
        int linesCounter = 0;
        int wordCounter=0;
        int charCounter=0;


        if (file.exists()) {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String contents = br.readLine();

            while (contents != null) {
                linesCounter++;
                String[] wordsInLine=contents.split(" ");
                wordCounter=wordCounter+wordsInLine.length;

                for(int interator=0;interator<wordsInLine.length;interator++){
                    charCounter=charCounter+wordsInLine[interator].length();
                }

                contents = br.readLine();
            }

        }
        System.out.println("Number of Lines=" + linesCounter);
        System.out.println("Number of words="+wordCounter);
        System.out.println("Number of characters="+charCounter);

    }
}
