import models.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoService {

    public static void loadDriver() {
        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("The driver was successfully loaded.");
        } catch (ClassNotFoundException e) {
            System.out.println("The driver class was not found in the program files at runtime.");
            System.out.println(e);
            System.exit(1);
        }
    }

    public static void testDatabaseConnection() {

    }

    public static void createTable() { }

    public static void saveCustomers(List<Customer> customers) { }

    public static List<Customer> loadAllCustomers() { return new ArrayList<>(); }

}