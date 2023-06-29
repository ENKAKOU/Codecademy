package java_english.object_java.methods;

public class Store6 {

    String productType;
    double price;

    public Store6(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    public double getPriceWithTax(){
        double tax = 0.08;
        double totalPrice = price + price*tax;
        return totalPrice;
    }

    public static void main(String[] args) {
        Store6 lemonadeStand = new Store6("Lemonade", 3.75);

        double lemonadePrice = lemonadeStand.getPriceWithTax();

        System.out.println(lemonadePrice);

    }
}