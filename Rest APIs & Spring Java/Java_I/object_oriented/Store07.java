public class Store07 {

    String productType;
    int inventoryCount;
    double inventoryPrice;

    public Store07(String product, int count, double price) {
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;

    }

    public static void main(String[] args) {
        Store cookieShop = new Store("cookies", 12, 3.75);

    }
}