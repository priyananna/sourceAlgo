/**
 * Created by priyankananna on 4/26/19.
 */
public class MergeArray {

    public static int[] mergeArrays(int[] myArray, int[] alicesArray) {

        // combine the sorted arrays into one large sorted array
        int result[] = new int[myArray.length + alicesArray.length];
        int myArLen = myArray.length;
        int alicArLen = alicesArray.length;
        if (myArLen == 0 && alicArLen != 0) {
            return alicesArray;
        }
        if (myArLen != 0 && alicArLen == 0) {
            return myArray;
        }
        int mpt = 0;
        int apt = 0;
        for (int i = 0; i < result.length; i++) {
            if (mpt < myArLen && apt < alicArLen) {
                if (myArray[mpt] > alicesArray[apt]) {
                    result[i] = alicesArray[apt];
                    apt++;
                } else {
                    result[i] = myArray[mpt];
                    mpt++;
                }
            }
            else if (mpt == myArLen && apt < alicArLen) {
                    result[i] = alicesArray[apt];
                    apt++;
                }
            else if (apt == alicArLen && mpt < myArLen) {
                    result[i] = myArray[mpt];
                    mpt++;
                }


        }
        return result;
    }

    public static void main(String args[]){
        MergeArray mergeArray = new MergeArray();
        int[] a = {1,4, 5};
        int[] b = {6,7};
        int res[] = mergeArray.mergeArrays(a,b);

        for(int i : res){
            System.out.println(i);
        }

    }

}




