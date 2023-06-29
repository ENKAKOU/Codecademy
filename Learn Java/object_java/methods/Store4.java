package java_english.object_java.methods;

public class Store4 {
    String productType;

    public Store4(String product) {
        productType = product;
    }

    public void advertise() {
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }

    public void greetCustomer(String customer) {
        System.out.println("Welcome to the store, " + customer + "!");
    }

    public static void main(String[] args) {
        Store4 lemonadeStand = new Store4("Lemonade");
        lemonadeStand.greetCustomer("Laura");
    }
}
