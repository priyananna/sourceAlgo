import java.util.Arrays;

/**
 * Created by priyankananna on 2/9/19.
 */
class CountNoOfTriangles {
    public int triangleNumber(int[] nums) {

        int n = nums.length;
        int count = 0;
        int k = 0;
        Arrays.sort(nums);

        for(int i=0; i<n-2;i++)
        {
            k = i+2;
            for(int j=i+1; j<n-1 && nums[i] != 0; j++)
            {
                while((n>k) && (nums[i] + nums[j] > nums[k]))
                    k++;

                count += k-j-1;

            }
        }

        return count;
    }
}
