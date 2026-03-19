public class Drink2 {

    private String name;
    private int price;
    private int soldNumber;

    public Drink2(String name, int price, int soldNumber){
        this.name = name;
        this.price = price;
        this.soldNumber = soldNumber;
    }

    public void setSoldNumber(int soldNumber){
        this.soldNumber += soldNumber;
    }

    public int getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.name + ", " + this.price + ", " + this.soldNumber;
    }
}
