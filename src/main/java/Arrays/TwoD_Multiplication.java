package Arrays;

import java.util.Arrays;

public class TwoD_Multiplication {
    public static void main(String[] args) {
        int [][] B = {{3,2,1}, {1,2,3}, {1,3,2}};
        int [][] C = {{0,0,0}, {0,0,0}, {0,0,0}};
        int [][] A = {{1,2,3}, {3,2,1}, {1,3,2}};

        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;

        if (colsA != rowsB){
            System.out.println("Error");;
        }
        else{
            for(int i = 0; i < rowsA; i++){
                for(int j = 0; j < colsB; j++){
                    for(int k = 0; k < colsA; k++){
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(C));

    }


}
