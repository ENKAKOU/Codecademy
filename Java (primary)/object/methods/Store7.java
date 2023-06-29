package java_english.object_java.methods;

public class Store7 {

    String productType;
    double price;

    public Store7(String product, double initialPrice) {
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

    public String toString(){
        return "This store sells " + productType + " at a price of " + price + ".";
    }

    public static void main(String[] args) {
        Store7 lemonadeStand = new Store7("Lemonade", 3.75);
        Store7 cookieShop = new Store7("Cookies", 5);

        System.out.println(lemonadeStand);
        System.out.println(cookieShop);

    }
}