import java.util.ArrayList;

public class Main5 {

        public static void main(String[] args){

            ArrayList<String> data = new ArrayList<>();
            data.add("Espresso, A powerful and concentrated coffee, 25.0");
            data.add("Latte, Espresso with steamed milk, 45.0");
            data.add("Cola, Cold and carbonated, 30.0");
            data.add("Water, Still springwater, free");

            double total = 0;
            for (String s : data){
                String[] dataSplit = s.split(",");
                String drinkName = dataSplit[0].trim();
                String drinkDescription = dataSplit[1].trim();
                try {
                    double drinkPriceNumber = Double.parseDouble(dataSplit[2].trim());
                    total += drinkPriceNumber;

                }
                catch (NumberFormatException e){
                    System.out.println("Invalid price for " + drinkName + ": " + dataSplit[2].trim() + " - price must be a number");
                }

            }
            System.out.println("Total: " + total + " kr");
        }
}
