import java.io.File;
// import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileReader {
    
    public static void main(String[] args) throws IOException{
    File file = new File("C:\\Users\\ajayr\\OneDrive\\Desktop\\ceil.txt");
    /*
     * scanner ka kaam hain 1-1 line scan karna baari baari
     */

    Scanner scn=new Scanner(file);
    String fileContent="hello\n";
    while(scn.hasNextLine()){
        fileContent=fileContent.concat(scn.nextLine()+"\n");
    }

    // System.out.println(fileContent);

    FileWriter writer = new FileWriter("C:\\Users\\ajayr\\OneDrive\\Desktop\\newFile.txt");
    writer.write(fileContent);
    writer.close();

    scn.close();
    }
}
