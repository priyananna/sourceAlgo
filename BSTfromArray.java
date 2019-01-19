/**
 * Created by priyankananna on 1/18/19.
 */
//Program to convert
public class BSTfromArray {

    public class TreeNode{

        int data;
        TreeNode left;
        TreeNode right;


        public TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
       }
    }


    public TreeNode createTreeNode(int arr[], int start, int end){

        if(start > end){return null;}
        int mid = (start + end)/2;
        TreeNode treeNode = new TreeNode(arr[mid]);
        treeNode.left = createTreeNode( arr, start,  mid-1);
        treeNode.right = createTreeNode(arr, mid+1, end);

         return treeNode;
    }

    public void printTree(TreeNode root){
        if(root==null){return;}

        printTree(root.left);
        System.out.println(root.data);
        printTree(root.right);

    }


    public static void main(String args[]){

        BSTfromArray bstArr = new BSTfromArray();
        int arr[] = {1,2,3,4,5,6,7};
        TreeNode root = bstArr.createTreeNode(arr,0, arr.length-1);
        bstArr.printTree(root);

    }
}
