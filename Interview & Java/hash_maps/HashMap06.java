public class HashMap06 {

    public String[] hashmap;

    public HashMap(int size) {
        this.hashmap = new String[size];
    }

    public int hash(String key) {
        int hashCode = 0;
        for (int i = 0; i < key.length(); i++) {
            hashCode = hashCode + Character.codePointAt(key, i);
        }
        hashCode = hashCode % this.hashmap.length;
        return hashCode;
    }

    public void assign(String key, String value) {
        int arrayIndex = this.hash(key);
        this.hashmap[arrayIndex] = value;
    }

    public static void main(String[] args) {

    }
}