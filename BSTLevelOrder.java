import java.util.ArrayList;
import java.util.List;

/**
 * Created by priyankananna on 2/24/19.
 */
public class BSTLevelOrder {

    public class TreeNode {
      int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
  }
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        if(root!=null){
            current.add(root.val);
        }
        while(current.size() > 0){
            result.add(current);
            current = new ArrayList<>();
            TreeNode left = root.left;
            TreeNode right = root.right;
            if(left != null) current.add(left.val);
            if(right != null) current.add(right.val);
        }
        return result;
    }

    public static void main(String args[]){

        BSTfromArray bstArr = new BSTfromArray();
        int arr[] = {1,2,3,4,5,6,7};
        BSTfromArray.TreeNode root = bstArr.createTreeNode(arr,0, arr.length-1);
        bstArr.printTree(root);


    }
}
