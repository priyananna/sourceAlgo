/**
 * Created by priyankananna on 2/17/19.
 */
public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++){

            while (strs[i].indexOf(prefix) != 0) {
                System.out.println("Prefix value" + strs[i].indexOf(prefix) + " prefix" + prefix );
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
            System.out.println("after Prefix value" + strs[i].indexOf(prefix) + " prefix" + prefix );
        }
        return prefix;
    }
    public static void main(String args[]){
        longestCommonPrefix p = new longestCommonPrefix();
        String[] strs = {"flower", "flow", "flight" };
        String s = p.longestCommonPrefix(strs);
        System.out.println(s);

    }
}
