import java.util.*;

/**
 * Created by priyankananna on 5/27/19.
 */

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
public class CloneGraph {

    class Solution {
        public Node cloneGraph(Node node) {
            Queue<Node> queue = new LinkedList<>();
            Map<Node, Node> map = new HashMap<>();
            queue.add(node);
            map.put(node, new Node(node.val, new ArrayList<Node>()));
            while(!queue.isEmpty()){
                Node n = queue.poll();
                for(Node neighbor: n.neighbors){
                    if(!map.containsKey(neighbor)){
                        map.put(neighbor, new Node(n.val, new ArrayList<Node>()));
                        queue.add(neighbor);
                    }
                    map.get(n).neighbors.add(map.get(neighbor));
                }
            }
            return map.get(node);
        }
    }
}
