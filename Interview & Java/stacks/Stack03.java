public class Stack03 {

    public LinkedList stack;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;

    public Stack() {
        this(DEFAULT_MAX_SIZE);
    }

    public Stack(int maxSize) {
        this.stack = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    // Define push() below
    public void push(String data) {
        this.stack.addToHead(data);
        this.size++;
        System.out.println("Added " + data + "! Stack size is now " + this.size);
    }

    public static void main(String[]args) {
        Stack dishes = new Stack();
        dishes.push("blue plate");
        dishes.push("white plate");
        dishes.push("yellow plate");
        System.out.println("The " + dishes.stack.head.data + " is at the top of the stack.");

    }
}