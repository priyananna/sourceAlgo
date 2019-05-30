/**
 * Created by priyankananna on 4/14/19.
 */
public class KthsmallestBinarySearch {
        public int kthSmallest(int[][] matrix, int k) {
            int lo = matrix[0][0], hi = matrix[matrix.length - 1][matrix[0].length - 1] + 1;//[lo, hi)
            while(lo < hi) {
                int mid = lo + (hi - lo) / 2;
                int count = 0,  j = matrix[0].length - 1;
                for(int i = 0; i < matrix.length; i++) {
                    while(j >= 0 && matrix[i][j] > mid) j--;
                    count += (j + 1);
                }
                if(count < k) lo = mid + 1;
                else hi = mid;
            }
            return lo;
        }
    public static void main(String args[]){

        KthsmallestBinarySearch ksmall = new KthsmallestBinarySearch();
        int m[][] = { {1,2,3},{4,5,6},{7,8,10}};
        int k = 7;
        int res = ksmall.kthSmallest(m,k);
        System.out.println(res);

    }

    }
