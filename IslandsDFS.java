import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by priyankananna on 1/12/19.
 */
/*
program to find the island in an matrix in a sorted order.
where 1 is to indicate a land and 0 is to indicate water.
First line consists of the input matrix row integer followed by the columns integer.
Example -->

   input
   4 5
   1 0 0 1 0
   1 0 1 0 0
   0 0 1 0 1
   1 0 1 0 1

   output
   1 2 2 4
   */

class IslandsDFS
{


   private List<Integer>  getIslandsList(int[][] arr, int n, int k){
       int row=n;
       int column =k;
       int result;
       List<Integer> resultlst = new ArrayList<>();

       boolean visited[][] = new boolean[row][column];


       for(int i =0;i<arr.length; ++i) {
           for (int j = 0; j < arr[0].length; ++j) {

               if (arr[i][j] == 1 && !visited[i][j]) {
                result =1;
                result = result + depthFirstSearch(arr, i, j, visited);
                resultlst.add(result);


               }
           }

       }
       Collections.sort(resultlst);
       return resultlst ;
   }

     private int  depthFirstSearch(int arr[][],int row, int column, boolean visited[][]){

       int ROW[] = new int[] {-1, -1, -1, 0, 0, 1, 1 ,1};
       int COL[] = new int[] {-1, 0, 1, -1, 1, -1, 0, 1};
       int resultcount =0;
       visited[row][column] = true;

         // System.out.println("Processing location [" +row+ "]["+column+"]");

       for(int i =0; i<8;++i)

           if(checkOk(arr,row + ROW[i], column + COL[i], visited))
               resultcount = depthFirstSearch(arr, row + ROW[i], column + COL[i], visited) + 1;

     return resultcount;
   }

    private boolean checkOk(int[][] arr, int row, int col, boolean[][] visited){

        if ((row >= 0) && (col >= 0) && (row < arr.length) && (col < arr[0].length)) {
            if ((arr[row][col] ==1) && !(visited[row][col])) {
                return true;
            }

        }

        return  false;

    }


    public static void main(String args[]){
        IslandsDFS island = new IslandsDFS();
     /*   Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        int k = sc.nextInt();
          for(int i=0; i<n;i++){
            for(int j=0; j<k; k++){
                arr[i][j] = sc.nextInt();
            }
        }*/
       int n =4;
        int k = 5;

        List<Integer> result;
        int arr[][] = new int[][]{
                {1, 0, 0, 1, 0},
                {1, 0, 1, 0, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 1, 0, 1}
        };


        result = island.getIslandsList(arr, n, k);
        for(int a : result){
            System.out.println(a);
        }
    }
}
