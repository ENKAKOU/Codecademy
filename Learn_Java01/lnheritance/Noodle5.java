package java_english.lnheritance;

class Noodle5 {

    protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    public Noodle5(double lengthInCentimeters, double widthInCentimeters, String shape, String ingredients) {
        this.lengthInCentimeters = lengthInCentimeters;
        this.widthInCentimeters = widthInCentimeters;
        this.shape = shape;
        this.ingredients = ingredients;
    }

    public String getCookPrep() {
        return "Boil noodle for 7 minutes and add sauce.";
    }

    public static void main(String[] args) {
        Noodle5 spaghetti, ramen, pho;

    }

}