package java_english.object_oriednted_java;

public class Store4 {

    String productType;

    public Store4() {
        System.out.println("I am inside the constructor method.");
    }

    public static void main(String[] args) {
        System.out.println("This code is inside the main method.");

        Store4 lemonadeStand = new Store4();

        System.out.println(lemonadeStand);
    }
}

