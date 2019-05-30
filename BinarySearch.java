/**
 * Created by priyankananna on 4/30/19.
 */
public class BinarySearch {

    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        int mid = 0;
        int[] result = new int[]{-1,-1};
        int count = 0;
        while(start < end){
            mid = start + (end - start)/2 ;
            if(target < nums[mid]) {
                end = mid-1;
            }
            if(target > nums[mid]){
                start = mid +1;
            }
            if(target == nums[mid]){
                result[count] = mid;
                count++;

            }
            if(count == 2){
                return result;
            }
        }
        return result;
    }
    public static void main(String args[]){
        BinarySearch binarySearch = new BinarySearch();
        int[] a = {1, 3, 4, 5,6,7,7};
        int[] res  = binarySearch.searchRange(a,5);
        System.out.println(res);
    }
}
