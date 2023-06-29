import java.util.*;

public class Dijkstra {

    public static Dictionary[] dijkstra (Graph g, Vertex startingVertex){
        Dictionary<String, Integer> distances = new Hashtable<>();

        for (Vertex v: g.getVertices()) {
            distances.put(v.getData(), Integer.MAX_VALUE);
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
