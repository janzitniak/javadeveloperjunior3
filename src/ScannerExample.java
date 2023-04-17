import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ScannerExample {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            String text = myReader.nextLine();
            System.out.println("Načítaný text: " + text);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Súbor sa nenašiel.");
            e.printStackTrace();
        }
    }
}
