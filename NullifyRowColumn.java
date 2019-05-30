/**
 * Created by priyankananna on 2/28/19.
 */
public class NullifyRowColumn {
    class Solution {
        public void setZeroes(int[][] matrix) {
            Boolean row[] = new Boolean[matrix.length];
            Boolean column[] = new Boolean[matrix[0].length];
            for(int i=0; i<matrix.length; i++){
                for(int j=0; j<matrix[0].length; j++){
                    if(matrix[i][j] == 0){
                        row[i] = true;
                        column[j] = true;
                    }
                    else{
                        row[i] = false;
                        column[j] = false;
                    }
                }
            }
            for(int i=0; i<matrix.length;i++){
                if(row[i])
                    for(int j=0; j<matrix[0].length; j++){
                        matrix[i][j] = 0;
                    }
            }

            for(int j=0; j<matrix[0].length; j++){
                if(column[j])
                    for(int i=0; i<matrix.length; i++){
                        matrix[i][j] = 0;
                    }
            }
        }

    }
    }


