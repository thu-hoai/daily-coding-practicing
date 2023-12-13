package com.example.algorithms.leetcode;

public class BinaryMatrix {

    public static int numSpecial(int[][] matrix) {
        int count = 0;
        int m = matrix.length;
        int n = matrix[0].length;

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (matrix[row][col] == 1) {
                    if (!onlyOneCellOneInRow(matrix, row, col)) {
                        continue;
                    }
                    if (!onlyOneCellOneInCol(matrix, row, col)) {
                        continue;
                    }
                    count++;
                }
            }
        }
        return count;
    }


    // Check if only one cell in the row is 1
    private static boolean onlyOneCellOneInRow(int[][] matrix, int row, int col) {
        for (int i = 0; i < matrix[row].length; i++) {
            if (col != i && (matrix[row][i] == 1)) {
                return false;
            }

        }
        return true;
    }

    // Check if only one cell in the column is 1
    private static boolean onlyOneCellOneInCol(int[][] matrix, int row, int col) {
        for (int i = 0; i < matrix.length; i++) {
            if (i != row && (matrix[i][col] == 1)) {
                return false;
            }
        }
        return true;
    }
}
