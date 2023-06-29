import java.lang.Thread;

public class BurgerMaker {

    public void toastBuns() {
        try {
            System.out.println("Toasting buns...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public void grillPatty() {
        System.out.println("Grilling patty...");
        Thread.sleep(1500);
    }

    public void meltCheese() {
        System.out.println("Melting cheese...");
        Thread.sleep(800);
    }

    public void fryOnions() {
        System.out.println("Frying onions...");
        Thread.sleep(1000);
    }

    public void assembleBurger() {
        System.out.println("Assembling burger...");
        Thread.sleep(1500);
    }

    public static void main(String[] args) {
        BurgerMaker burgerMaker = new BurgerMaker();

        Thread t1 = new Thread(() -> burgerMaker.toastBuns());
        Thread t2 = new Thread(() -> burgerMaker.grillPatty());
        Thread t3 = new Thread(() -> burgerMaker.meltCheese());
        Thread t4 = new Thread(() -> burgerMaker.fryOnions());
        Thread t5 = new Thread(() -> burgerMaker.assembleBurger());

        t1.start();
        t2.start();
        t4.start();
        t2.join();
        t3.start();
        t1.join();
        t3.join();
        t4.join();

        t5.start();
        t5.join();
        System.out.println("Burger complete!");

    }
}
