public class Store11 {

    String productType;

    public Store11(String product) {
        productType = product;
    }

    public void advertise() {
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }

    public void greetCustomer(String customer){
        System.out.println("Welcome to the store, " + customer + "!");
    }

    public static void main(String[] args) {
        Store lemonadeStand = new Store("Lemonade");
        lemonadeStand.greetCustomer("Laura");

    }
}