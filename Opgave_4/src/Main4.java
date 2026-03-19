import java.util.ArrayList;

public class Main4 {

    public static void main(String[] args){

        ArrayList<String> data = new ArrayList<>();
        data.add("Espresso, A powerful and concentrated coffee, 25.0");
        data.add("Latte, Espresso with steamed milk, 45.0");
        data.add("Cola, Cold and carbonated, 30.0");


        for (String s : data){
            String[] dataSplit = s.split(",");
            String drinkName = dataSplit[0].trim();
            String drinkDescription = dataSplit[1].trim();
            String drinkPrice = dataSplit[2].trim();

            System.out.println(drinkName + " - " + drinkDescription + " (" + drinkPrice + " kr)");
        }
    }
}
