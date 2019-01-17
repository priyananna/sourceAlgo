import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by priyankananna on 1/17/19.
 */
public class Path2Vertices {

    private static int ver;
    private static LinkedList<Integer>[] adj;

     Path2Vertices(int v){

         ver = v;
        adj = new LinkedList[v];
        for(int i =0;i<v;i++){
          adj[i] = new LinkedList<>();

        }

    }


    void addEdge(int v, int w){
        adj[v].add(w);

    }

    static boolean pathfind(int s, int d) {

        boolean visited[] = new boolean[ver];
        LinkedList<Integer> queue = new LinkedList<>();
        if (s == d) {
            return true;
        }

        queue.add(s);


        Iterator<Integer> i;
        while (!queue.isEmpty()) {

            s = queue.poll();
            i = adj[s].listIterator();

            while (i.hasNext()) {
                int n = i.next();

                if (n == d) {
                    return true;
                }

                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }

            }

        }

        return false;
    }


        public static void main(String[] args) {

        Path2Vertices p = new Path2Vertices(4);
            p.addEdge(0, 1);
            p.addEdge(0, 2);
            p.addEdge(1, 2);
            p.addEdge(2, 0);
            p.addEdge(2, 3);
            p.addEdge(3, 3);

           boolean result = pathfind(0,2);
            System.out.println("result " + result);
    }




}
