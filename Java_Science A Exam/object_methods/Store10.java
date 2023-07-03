public class Store10 {

    String productType;

    public Store10(String product) {
        productType = product;
    }

    public void advertise() {
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }

    public static void main(String[] args) {
        String cookie = "Cookies";
        Store cookieShop = new Store(cookie);
        cookieShop.advertise();
    }
}