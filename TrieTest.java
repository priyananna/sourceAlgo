import java.util.HashMap;
import java.util.Map;


/**
 * Created by priyankananna on 4/27/19.
 */
public class TrieTest {

    // implement a trie and use it to efficiently store string

    static Map<String, Integer> map = new HashMap<>();

    static class Trie {

        public boolean addWord(String word) {


            if(word == null){
                return false;
            }

            if (map.containsKey(word)) {
                return false;
            }
            else{
                map.put(word, 1);
            }
           for (int i = 1; i <= word.length(); i++) {
                String temp = word.substring(0, i);
                if (!map.containsKey(temp))
                    map.put(temp, 1);
            }
            return true;
        }


    }
    public static void main(String args[]){
      Trie trie = new Trie();
      trie.addWord("catch");

        boolean result = trie.addWord("catch");
        System.out.println("result4 "+result);

        result = trie.addWord("cakes");
        System.out.println(result);

        result = trie.addWord("cake");
        System.out.println("result1 " + result);

        result = trie.addWord("cake");
        System.out.println("result2 "+ result);

        result = trie.addWord("caked");
        System.out.println("result3 "+result);



        result = trie.addWord("");
        System.out.println("result5 "+result);

        result = trie.addWord("");
        System.out.println("result6 "+result);


     }

}
