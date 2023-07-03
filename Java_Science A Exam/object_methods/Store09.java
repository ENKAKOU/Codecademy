public class Store09 {

    String productType;

    public Store09(String product) {
        productType = product;
    }

    public void advertise() {
        System.out.println("Selling " + productType + "!");
        System.out.println("Come spend some money!");
    }

    public static void main(String[] args) {
        Store lemonadeStand = new Store("Lemonade");
        lemonadeStand.advertise();
        lemonadeStand.advertise();
        lemonadeStand.advertise();
    }
}