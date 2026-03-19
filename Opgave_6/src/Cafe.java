import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cafe {

    private ArrayList<Drink2> coffeeMenu = new ArrayList<>();
    private String header;

    public Cafe(){
        loadData();
        showMenu();
    }

    public void loadData(){
        try {
            File file = new File("Opgave_6/data/menu.csv");
            Scanner scanner = new Scanner(file);
            //skipping and saving header
            header = scanner.nextLine();
            while(scanner.hasNextLine()){
                String[] data = scanner.nextLine().split(",");
                coffeeMenu.add(new Drink2(data[0].trim(), Integer.parseInt(data[1].trim()), Integer.parseInt(data[2].trim())));
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

    public void saveData(){
        try (FileWriter writer = new FileWriter("Opgave_6/data/menu.csv")){
            //writing back header
            writer.write(header + "\n");
            for (Drink2 drink : coffeeMenu){
                writer.write(drink.toString() + "\n");
            }
        }
        catch (IOException e){
            System.out.println("Error saving file");
            System.out.println(e.getMessage());
        }

    }

    public void showMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean buyingMoreDrinks = true;
        while (buyingMoreDrinks){
            System.out.println("Would you like to buy a drink? y/n");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("y")){
                //Print menu
                System.out.println("Menu:");
                for (int i = 0 ; i < coffeeMenu.size() ; i++){
                    System.out.println((i+1) + " | " + coffeeMenu.get(i).getName());
                }

                //Ask user for what drink
                System.out.println();
                System.out.println("Pick the number of the coffee you would like to buy");
                try {
                    int drinkChoice = scanner.nextInt();
                    System.out.println("Bought: " + coffeeMenu.get(drinkChoice-1).getName() + " for " + coffeeMenu.get(drinkChoice-1).getPrice() + " kr");
                    System.out.println();
                    coffeeMenu.get(drinkChoice-1).setSoldNumber(1);
                }
                catch (InputMismatchException e){
                    System.out.println("Input be a number");
                    System.out.println(e.getMessage());
                }
                catch (IndexOutOfBoundsException e){
                    System.out.println("Not a drink choice, please pick between 1-" + coffeeMenu.size());
                    System.out.println(e.getMessage());
                }
                finally{
                    //Scanner bug
                    scanner.nextLine();
                }

            } else {
                buyingMoreDrinks = false;
            }

            saveData();

        }

    }
}
