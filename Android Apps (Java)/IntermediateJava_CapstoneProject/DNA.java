public class DNA {

    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ARGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";

    String dna = dna1;

    public static void main(String[] args) {
        DNA dnaObject = new DNA();
        int length = dnaObject.dna.length();

        System.out.println("Length: " + length);

// -. .-. .-. .-. .
// \ \ / \ \ /
// / \ \ / \
// ~ -~ - -~ `-

    }
}