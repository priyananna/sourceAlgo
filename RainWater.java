/**
 * Created by priyankananna on 5/25/19.
 */
public class RainWater {

    public int trap(int[] height) {
        int left =0, right = height.length-1;
        int leftmax =0,rightmax =0, ans=0;
        while(left < right){
            if(height[left] < height[right]){
                if( height[left] >= leftmax )
                    leftmax = height[left];
                else
                    ans += leftmax - height[left];
                left++;
            }
            else{
                if(height[right]>= rightmax)
                    rightmax = height[right];
                else
                    ans+= rightmax - height[right];

                right--;
            }
        }
        return ans;
    }
       public static void main(String args[]){
           RainWater rainWater = new RainWater();
           int h[] = {0,1,0,2,1,0,1,3,2,1,2,1};
           System.out.println(rainWater.trap(h));
       }

}
