import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args){

        Drink drink = new Drink();
        System.out.println(drink);
        System.out.println();

        drink.setPrice(20);
        System.out.println(drink);
        System.out.println();

        try {
            drink.setPrice(-10);
        }
        catch (IllegalArgumentException e){
            System.out.println("Error - Price cannot be set to a negative number");
        }
        System.out.println();

        //Opgave 2b (del 2)

        ArrayList<String> items = new ArrayList<>();
        items.add("Item1");
        items.add("Item2");
        items.add("Item3");
        items.add("Item4");

        System.out.println(getItem(items, 2));
        try{
            getItem(items, 5);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static String getItem(ArrayList<String> items, int index){
        try {
            return items.get(index);
        }
        catch (IndexOutOfBoundsException e){
            throw new IllegalArgumentException("Error - index out of range. Available range is 0 - " + items.size());
        }
    }

}
