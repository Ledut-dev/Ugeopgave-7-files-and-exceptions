import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args){

        try{
            readLines("data.csv");
        }
        catch(FileNotFoundException e){
            System.out.println("File not found, or error opening file");
        }

    }


    public static ArrayList<String> readLines(String path) throws FileNotFoundException {
        ArrayList lines = new ArrayList<>();
        Scanner scan = new Scanner(new File(path));
        while (scan.hasNextLine()) {
            lines.add(scan.nextLine());
        }
        scan.close();

        return lines;
    }
}
