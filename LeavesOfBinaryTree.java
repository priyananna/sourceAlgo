import java.util.ArrayList;
import java.util.List;

/**
 * Created by priyankananna on 5/14/19.
 *
 */

public class LeavesOfBinaryTree {

      public static class TreeNode{
          int val;
          TreeNode left;
          TreeNode right;
          public TreeNode(int val){
              this.val =val;
              left = null;
              right = null;
          }

       }

    public List<List<Integer>> findLeaves(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            height(root, res);
            return res;
        }
    private int height(TreeNode node, List<List<Integer>> res){
        if(null==node)  return -1;
        int level = 1 + Math.max(height(node.left, res), height(node.right, res));
        if(res.size()<level+1)
            res.add(new ArrayList<>());
        res.get(level).add(node.val);
        return level;
    }

        public static void main(String args[]){

            TreeNode node = new TreeNode(1);
            TreeNode curr = node;
            node.left = new TreeNode(2);
            node.left.left = new TreeNode(4);
            node.right = new TreeNode(3);
            node.left.right = new TreeNode(5);
            LeavesOfBinaryTree leavesOfBinaryTree = new LeavesOfBinaryTree();
            List<List<Integer>> result = leavesOfBinaryTree.findLeaves(curr);
            result.forEach(System.out::print);
        }
    }

