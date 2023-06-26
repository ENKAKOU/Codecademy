import java.util.ArrayList;

public class MinHeap {

    public ArrayList<Integer> heap;
    public int size;

    // Define MinHeap constructor below
    public MinHeap() {
        this.heap = new ArrayList<Integer>();
        this.size = 0;
        this.heap.add(null);
    }

    public static void main(String[]args) {
        // Instantiate a MinHeap, assign to minHeap
        MinHeap minHeap = new MinHeap();
        // Display contents of minHeap
        System.out.println(minHeap.heap);

    }
}