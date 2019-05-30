import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


/**
 * Created by priyankananna on 5/18/19.
 */
public class DataReadFromList2DUsingInterator implements Iterator<Integer>{
    Iterator<Integer> col;
    Iterator<List<Integer>> row;
    public DataReadFromList2DUsingInterator(List<List<Integer>> list){
        row = list.iterator();
        if(row.hasNext()){
            col = row.next().iterator();
        }
    }


    public boolean hasNext(){
     if(col == null ) return false;
       while(!col.hasNext()&& row.hasNext())
           col = row.next().iterator();
        return col.hasNext();
    }

    public Integer next(){
        return col.next();

    }


    public static void main(String args[]){
        List<List<Integer>> list = new ArrayList<>(Arrays.asList(Arrays.asList(1,2,3),Arrays.asList (6,7,8)));
       DataReadFromList2DUsingInterator dataRead = new DataReadFromList2DUsingInterator(list);
      while(dataRead.hasNext()){
          System.out.println(dataRead.next());
      }


    }
}
