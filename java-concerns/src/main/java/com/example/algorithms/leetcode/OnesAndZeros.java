package com.example.algorithms.leetcode;

/**
 * Difference Between Ones and Zeros in Row and Column
 * https://leetcode.com/problems/difference-between-ones-and-zeros-in-row-and-column
 */
public class OnesAndZeros {

    public static int[][] onesMinusZerosO3(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = calculateDifferences(grid, i, j);
            }
        }

        return result;

    }

    public static int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] result = new int[m][n];

        // Counting ones and zeros in each row and column
        int[] onesRow = new int[m];
        int[] onesCol = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    onesRow[i]++;
                    onesCol[j]++;
                } else {
                    onesRow[i]--;
                    onesCol[j]--;
                }
            }
        }

        // Calculate the difference matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = onesRow[i] + onesCol[j] ;
            }
        }

        return result;
    }

    private static int calculateDifferences(int[][] grid, int i, int j) {
        int res = 0;
        for (int k = 0; k < grid[i].length; k++) {
            if (grid[i][k] == 1) {
                res += 1;
            } else {
                res -= 1;
            }
        }

        for (int k = 0; k < grid.length; k++) {
            if (grid[k][j] == 1) {
                res += 1;
            } else {
                res -= 1;
            }
        }
        return res;
    }
}
