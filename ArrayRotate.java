/**
 * Created by priyankananna on 2/23/19.
 */
//Array Rotate right side

public class ArrayRotate {
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

        for(int num:nums)
        System.out.println(num);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
       // ArrayRotate ar = new ArrayRotate();
        int[] a = {1,2,3,4,5,6,7,8};
         rotate(a, 3);

    }
}
