import java.util.Scanner;

public class Main1 {

    Scanner scan = new Scanner(System.in);

    public int promptNumber(String msg){
        System.out.println(msg);
        try {
            return Integer.parseInt(scan.nextLine());
        }
        catch (NumberFormatException e){
            System.out.println("Error: Input not a whole number - try again");
            return promptNumber(msg);
        }

    }

}
