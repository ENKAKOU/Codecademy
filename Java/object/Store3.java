public class Store3 {

    public Store3() {
        System.out.println("I am inside the constructor method.");
    }

    public static void main(String[] args) {
        System.out.println("Start of the main method.");

        Store3 lemonadeStand = new Store3();
        System.out.println(lemonadeStand);
    }
}