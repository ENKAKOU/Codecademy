package java_english.lnheritance;

class Noodle2 {

    double lengthInCentimeters;
    double widthInCentimeters;
    String shape;
    String ingredients;
    String texture = "brittle";

    Noodle2(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

    public void cook() {

        this.texture = "cooked";

    }

    public static void main(String[] args) {

    }
}