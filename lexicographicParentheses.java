/**
 * Created by priyankananna on 1/10/19.
 */
/* To print lexicographic order of parenthesis for the given integer.
 Example
 Input = 2
 output = (()) ()

*/
public class lexicographicParentheses {

    public static void main(String args[]) {

        // define a integers variable to keep track of the open and close parenthesis
        int opencount = 0;
        int closecount = 0;
        int pos = 0;

      /*   Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        */
        //Testing for example input
        int n = 2;
        //Define a character array to keep to hold the parenthesis.
        char[] cArray = new char[2 * n];
        lexicographic(cArray, n, pos, opencount, closecount);

    }

    static void lexicographic(char[] cArray, int n, int pos, int opencount, int closecount) {

      if(closecount == n){
          for (int i=0;i<cArray.length;i++){
              System.out.print(cArray[i]);}
              System.out.print(" ");

      }

      else
      {
         if(opencount < n) {
           cArray[pos] = '(';
           lexicographic(cArray, n, pos+1, opencount+1, closecount);
         }
         if(opencount > closecount){
             cArray[pos] = ')';
             lexicographic(cArray, n, pos+1, opencount, closecount+1);
         }

      }//end of else

    }//end of lexicographic

}
