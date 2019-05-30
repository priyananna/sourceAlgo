import java.util.*;

/**
 * Created by priyankananna on 3/15/19.
 */
public class SortedSolution {
        public List<List<String>> groupAnagrams(String[] strs) {

            Map<String, List<String>> map = new HashMap<>();
             char[] c;
            String strTemp = null;
            for (String s : strs) {
                c = s.toCharArray();
                 Arrays.sort(c);
                 strTemp = String.valueOf(c);
             if(!map.containsKey(strTemp)){
                 map.put(strTemp, new ArrayList<String>());
             }
             map.get(strTemp).add(s);
            }
         return new ArrayList<>(map.values());
        }

    public List<List<String>> groupAnagrams2(String[] strs) {

        Map<String,List<String>> map = new HashMap<>();
        char[] c;
        String sTemp = null;
        for (int i=0;i<strs.length;i++) {
            c = strs[i].toCharArray();
            Arrays.sort(c);
            sTemp = String.valueOf(c);
            if(!map.containsKey(sTemp)){
                map.put(sTemp,new ArrayList<String>());
            }
            map.get(sTemp).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
        public static void main(String args[]){
            SortedSolution sln = new SortedSolution();
            String strs[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
            List<List<String>> res = sln.groupAnagrams(strs);
               res.forEach(System.out::println);

       //     for(List<String> result : res){
       //         System.out.println(result);

    //        }
        }
}
