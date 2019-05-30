/**
 * Created by priyankananna on 2/17/19.
 */
public class waterHeight {

        public int maxArea(int[] height) {
            int maxarea = 0, l = 0, r = height.length - 1;
            while (l < r) {
                maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
                if (height[l] < height[r])
                    l++;
                else
                    r--;
            }
            return maxarea;
        }
    public static void main(String args[]){
        waterHeight wH = new waterHeight();
        int[] a = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int res = wH.maxArea(a);
        System.out.println("Result " + res);

    }

}
