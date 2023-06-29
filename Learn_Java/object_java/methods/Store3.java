package java_english.object_java.methods;

public class Store3 {

    String productType;

    public Store3(String product) {
        productType = product;
    }

    public void advertise() {
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }

    public static void main(String[] args) {
        String cookie = "Cookies";
        Store3 cookieShop = new Store3(cookie);

        cookieShop.advertise();

    }
}
