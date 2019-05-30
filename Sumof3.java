import java.util.*;


/**
 * Created by priyankananna on 2/14/19.
 */
public class Sumof3 {
    public  static List<List<Integer>> sumOfThree(int[] nums){
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        int j=0, k=0, sum =0;
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            j=i+1;
            k=nums.length-1;
            while(j<k){
                sum = nums[i]+nums[j]+nums[k];
                if(sum == 0){
                    set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(sum > 0){ k--;
                }
                else if(sum <0) j++;
            }
        }
        return new ArrayList<>(set);

    }

    public static void main(String args[]){

        int[] a  = {-1, 0, 1 , 2, -1, 0};
       List<List<Integer>> result = sumOfThree(a);

       result.forEach(System.out::print);
    //  System.out.println("Count" + count);
    }


}
