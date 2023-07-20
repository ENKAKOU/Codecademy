class Noodle05 {
    protected double lengthInCentimeters;
    protected double widthInCentimeters;

    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    Noodle05(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;
    }

    public String getCookPrep() {
        return "Boil noodle for 7 minutes and add sauce.";
    }

    public static void main(String[] args) {
        Noodle spaghetti, ramen, pho;
        spaghetti = new Spaghetti();
        ramen = new Ramen();
        pho = new Pho();

    }
}