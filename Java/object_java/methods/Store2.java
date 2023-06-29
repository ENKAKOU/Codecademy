package java_english.object_java.methods;

public class Store2 {

    String productType;

    public Store2(String product) {
        productType = product;
    }

    public void advertise() {
        System.out.println("Selling " + productType + "!");
        System.out.println("Come spend some money!");
    }

    public static void main(String[] args) {
        Store2 lemonadeStand = new Store2("Lemonade");
        lemonadeStand.advertise();
        lemonadeStand.advertise();
        lemonadeStand.advertise();

    }
}
