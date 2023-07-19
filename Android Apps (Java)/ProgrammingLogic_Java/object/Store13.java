public class Store13 {
    String productType;
    double price;

    public Store13(String product, double initialPrice) {
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
        Store lemonadeStand = new Store("Lemonade", 3.75);
        double lemonadePrice = lemonadeStand.getPriceWithTax();

        System.out.println(lemonadePrice);

    }
}