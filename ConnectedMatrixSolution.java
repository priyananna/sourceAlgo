import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Input:
 [
 ['/', '\', '\'],
 ['\', '/', '\'],
 ['\', '\', '/']
 ]


1  - - - 2  - - - 3 - - -  4
|     ◎     ◎        ◎     |
|  ◎           ◎        ◎  |
5        6        7        8
|  ◎           ◎      ◎    |
|     ◎     ◎            ◎ |
9        10       11       12
|  ◎        ◎            ◎ |
|     ◎        ◎      ◎    |
13 - - - 14 - - - 15 - - - 16

Output:
Map<Integer, List<Integer>>
1 -> [2, 5]
2 -> [1, 5, 7, 3]
3 -> [2, 4, 8]

 */

/**
 * Created by priyankananna on 5/16/19.
*/
public class ConnectedMatrixSolution {
    public static Map<Integer, List<Integer>> getConnectedNodes(char[][] pattern, Integer[][] matrix){
          Map<Integer, List<Integer>> result = new HashMap<>();

          for(int i=0;i<matrix.length;i++){
              for(int j=0;j<matrix[0].length;j++){
                  Integer key = matrix[i][j];
                  result.putIfAbsent(matrix[i][j],new ArrayList<>());

                   if(i==0 || i==(matrix.length-1)){
                       if(j>0) {
                           result.get(key).add(matrix[i][j-1]);
                       }
                       if(j<(matrix[0].length-1)) {
                           result.get(key).add(matrix[i][j + 1]);
                       }

                  }

                  if(j==0 || j==(matrix[0].length-1)){
                       if(i>0){
                           result.get(key).add(matrix[i-1][j]);
                       }
                       if(i<matrix.length-1){
                           result.get(key).add(matrix[i+1][j]);
                       }
                  }

               }
            }


            for(int i=0; i<pattern.length;i++){
              for(int j=0; j<pattern[0].length;j++){
                  if(pattern[i][j] == '/'){
                      result.get(matrix[i][j+1]).add(matrix[i+1][j]);
                      result.get(matrix[i+1][j]).add(matrix[i][j+1]);
                  }
                  if(pattern[i][j] == '\\'){
                   result.get(matrix[i][j]).add(matrix[i+1][j+1]);
                   result.get(matrix[i+1][j+1]).add(matrix[i][j]);
                 }
              }
            }

          return result;
        }

    public static void main(String[] args){
        ConnectedMatrixSolution matrixSolution = new ConnectedMatrixSolution();
        char[][] pattern = {{'/','\\','\\'},
                {'\\', '/','\\'},
                {'\\','\\','/'}};
        Integer[][] mattrix = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};

        Map<Integer, List<Integer>> map = getConnectedNodes(pattern,mattrix);

        for(Map.Entry<Integer, List<Integer>> entry:map.entrySet()) {
            System.out.println("Key" + entry.getKey() +" Value "+ entry.getValue());
        }
    }

}
