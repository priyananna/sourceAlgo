import java.util.Stack;

/**
 * Created by priyankananna on 2/18/19.
 */
public class stackParenthesis {

    public boolean isValid(String s) {

        Stack<String> stk = new Stack<>();
        String temp = null;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(stk.size() != 0) {
                switch(c){
                    case '(' : stk.push("("); break;
                    case '{' : stk.push("{"); break;
                    case '[' : stk.push("["); break;
                    case ')' : if(!stk.pop().equals("("))
                        return false;
                        break;
                    case '}' : if(!stk.pop().equals("{"))
                        return false;
                        break;
                    case ']' : if(!stk.pop().equals("["))
                        return false;
                        break;

                }
            }

        }
        return true;
    }

    public static void main(String args[]) {
        stackParenthesis sp = new stackParenthesis();
        String s = "(]";
        boolean p = sp.isValid(s);
        System.out.println(p);
    }
}

