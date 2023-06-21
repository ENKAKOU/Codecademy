package java_english.lnheritance;

class Noodle4 {

    protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    Noodle4(double lenInCent, double wthInCent, String shp, String ingr) {
        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;
    }

    public void cook() {
        System.out.println("Boiling.");
        this.texture = "cooked";
    }

    public static void main(String[] args) {
        Spaetzle kaesespaetzle = new Spaetzle(10.0, 5.0, "curly", "eggs");
        kaesespaetzle.cook();
    }
}

class Spaetzle extends Noodle4 {
    public Spaetzle(double lenInCent, double wthInCent, String shp, String ingr) {
        super(lenInCent, wthInCent, shp, ingr);
    }
}
