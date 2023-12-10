package leetcode;

import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int[][] transposed = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9} };

        System.out.println(Arrays.deepToString(transpose(matrix)));
    }
}
