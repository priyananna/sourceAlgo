import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by priyankananna on 5/10/19.
 */
public class DuplicateSubTreeFinal {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x;
            left = null;
            right = null;
        } }


    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res = new LinkedList<>();
        postorder(root, new HashMap<>(), res);
        return res;
    }


    public String postorder(TreeNode cur, Map<String, Integer> map, List<TreeNode> res) {
        if (cur == null) return "#";
        String serial = cur.val + "," + postorder(cur.left, map, res) + "," + postorder(cur.right, map, res);
        if (map.getOrDefault(serial, 0) == 1) res.add(cur);
        map.put(serial, map.getOrDefault(serial, 0) + 1);
        return serial;
    }
    public static void main(String args[]){
      //  DuplicateSubtree duplicateSubtree = new DuplicateSubtree();

        DuplicateSubTreeFinal duplicateSubTreeFinal = new DuplicateSubTreeFinal();

        TreeNode node = new TreeNode(1);
        TreeNode curr = node;
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(4);
        node.right = new TreeNode(3);
        node.right.right = new TreeNode(4);
        node.right.left = new TreeNode(2);
        node.right.left.left = new TreeNode(4);

        List<TreeNode> result= duplicateSubTreeFinal.findDuplicateSubtrees(curr);
        for(TreeNode res : result){
            System.out.println("result  " + res.val +" "+ res.left +" "+ res.right );
        }

        //  duplicateSubtree.findDuplicateSubtrees();
    }

}
