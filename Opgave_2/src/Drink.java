import java.util.ArrayList;

public class Drink {

    private double price = 0;

    public void setPrice(double price){
        if (price < 0){
            throw new IllegalArgumentException("Price must be a positive number");
        }
        else{
            this.price = price;
        }
    }

    public String toString(){
        return "Price: " + this.price;
    }


}
