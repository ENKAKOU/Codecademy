public class Store12 {

    String productType;
    double price;

    public Store(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    public static void main(String[] args) {
        Store lemonadeStand = new Store("Lemonade", 3.75);
        lemonadeStand.increasePrice(1.5);
        System.out.println(lemonadeStand.price);

    }
}