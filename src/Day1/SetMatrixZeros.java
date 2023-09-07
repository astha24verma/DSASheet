package Day1;

import java.util.Arrays;

public class SetMatrixZeros {
    public static void main(String[] args) {

        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        // Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

        // int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        // Output: [[1,0,1],[0,0,0],[1,0,1]]

        System.out.println(Arrays.deepToString(matrix));
        setZeroes(matrix);
    }
    public static void setZeroes(int[][] matrix) {

        int col0 = 1; //[-1][-1]

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;

                    if(j != 0)
                        matrix[0][j] = 0;
                    else
                        col0 = 0;

                }
            }
        }

        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[i].length; j++){
                if(matrix[i][j] != 0){
                    if(matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        if(matrix[0][0] == 0){
            for(int j = 0; j < matrix[0].length; j++)
                matrix[0][j] = 0;
        }

        if(col0 == 0){
            for(int i = 0; i < matrix.length; i++)
                matrix[i][0] = 0;
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
