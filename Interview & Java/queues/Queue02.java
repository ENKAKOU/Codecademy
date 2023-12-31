public class Queue02 {

    public LinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;

    public Queue() {
        this(DEFAULT_MAX_SIZE);
    }

    public Queue(int maxSize){
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    public static void main(String[] args) {
        Queue queueOne = new Queue(10);
        System.out.println("queueOne can have "+ queueOne.maxSize + " nodes!");

        Queue queueTwo = new Queue();
        System.out.println("queueTwo can have "+ queueTwo.maxSize + " nodes!");

    }
}