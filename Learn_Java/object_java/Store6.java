package java_english.object_oriednted_java;

public class Store6 {
    String productType;

    public Store6(String product) {
        productType = product;
    }

    public static void main(String[] args) {
        Store6 lemonadeStand = new Store6("lemonade");
        System.out.println(lemonadeStand.productType);

    }
}