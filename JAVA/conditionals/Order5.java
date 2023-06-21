package java_english.conditionals;

public class Order5 {

    boolean isFilled;
    double billAmount;
    String shipping;

    public Order5(boolean filled, double cost, String shippingMethod) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }

    public void ship() {
        if (isFilled) {
            System.out.println("Shipping");
            System.out.println("Shipping cost: " + calculateShipping());
        } else {
            System.out.println("Order not ready");
        }
    }

    public double calculateShipping() {
        double shippingCost;

        switch (shipping) {

            case "Regular":
                shippingCost = 0;
                break;
            case "Express":
                shippingCost = 1.75;
                break;
            default:
                shippingCost = .50;
        }

        return shippingCost;
    }

    public static void main(String[] args) {
        Order5 book = new Order5(true, 9.99, "Express");
        Order5 chemistrySet = new Order5(false, 72.50, "Regular");

        book.ship();
        chemistrySet.ship();
    }
}
