package java_english.lnheritance;

public class Noodle3 {

    private double lengthInCentimeters;
    private double widthInCentimeters;
    private String shape;
    private String ingredients;
    private String texture = "brittle";

    public Noodle3(double lenInCent, double wthInCent, String shp, String ingr) {
        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;
    }

    public boolean isTasty() {
        return true;
    }

    public static void main(String[] args) {
        Ramen yasaiRamen = new Ramen(10.0, 5.0, "curly", "vegetables");
        System.out.println(yasaiRamen.isTasty());
    }
}

class Ramen extends Noodle3 {
    public Ramen(double lenInCent, double wthInCent, String shp, String ingr) {
        super(lenInCent, wthInCent, shp, ingr);
    }
}

