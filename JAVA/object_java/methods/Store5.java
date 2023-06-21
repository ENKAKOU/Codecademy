package java_english.object_java.methods;

public class Store5 {

    String productType;
    double price;

    // constructor method
    public Store5(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    public static void main(String[] args) {
        Store5 lemonadeStand = new Store5("Lemonade", 3.75);
        lemonadeStand.increasePrice(1.5);
        System.out.println(lemonadeStand.price);
    }
}

