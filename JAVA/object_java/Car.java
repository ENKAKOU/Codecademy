package java_english.object_java;

public class Car {

    String color;
    boolean isRunning;
    int velocity;

    public Car(String carColor, boolean carRunning, int milesPerHour) {
        color = carColor;
        // assign new parameters to the new fields
        isRunning = carRunning;
        velocity = milesPerHour;
    }

    public static void main(String[] args) {

        Car ferrari = new Car("red", true, 27);
        Car renault = new Car("blue", false, 70);

        System.out.println(renault.isRunning);
        System.out.println(ferrari.velocity);

    }
}
