public class Main03 {

    public static void main(String[] args) {

        SchoolPerson person = new SchoolPerson("Peter");
        Bus<SchoolPerson> busWPerson = new Bus<>(person);
        busWPerson.printRider();

    }
}