import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Created by priyankananna on 5/17/19.
 */
public class DataReadFromList2D {

    int indexList = 0;
    int indexEle = 0;
    List<List<Integer>> input;

    public DataReadFromList2D(List<List<Integer>> list) {
        input = list;
    }


    public boolean hasNext() {
    while(indexList < input.size()){
        if(indexEle < input.get(indexList).size()){
            return true;
        }
        else{
            indexList++;
            indexEle=0;
        }
    }

    return false;
    }



    public int Next(List<List<Integer>> list) {

        return list.get(indexList).get(indexEle++);
        }


    public static void main(String args[]){
        // [[1,2,3]
        //[4,5,6]]
        List<List<Integer>> list = new ArrayList<>(Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6)));
        DataReadFromList2D dataReadFromList2D = new DataReadFromList2D(list);
        int next =0;
       for(int i=0; i<list.size();i++) {
           while (dataReadFromList2D.hasNext()) {
                next = dataReadFromList2D.Next(list);
               System.out.print(next);
           }
       }
    }
}
