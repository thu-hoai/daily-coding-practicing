package com.example.algorithms.leetcode;


public class ImageSmoother {

    /**
     * https://leetcode.com/problems/image-smoother
     */
    public static int[][] imageSmoother(int[][] img) {
        int[][] result = new int[img.length][img[0].length];
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                int sum = img[i][j];
                int count = 1;
                if (i - 1 >= 0) {
                    sum += img[i - 1][j];
                    count += 1;
                }
                if (j - 1 >= 0) {
                    sum += img[i][j - 1];
                    count += 1;
                }
                if (i - 1 >= 0 && j - 1 >= 0) {
                    sum += img[i - 1][j - 1];
                    count += 1;
                }
                if (i - 1 >= 0 && j + 1 < img[0].length) {
                    sum += img[i - 1][j + 1];
                    count += 1;
                }
                if (i + 1 < img.length) {
                    sum += img[i + 1][j];
                    count += 1;
                }
                if (j + 1 < img[0].length) {
                    sum += img[i][j + 1];
                    count += 1;
                }
                if (i + 1 < img.length && j + 1 < img[0].length) {
                    sum += img[i + 1][j + 1];
                    count += 1;
                }
                if (j - 1 >= 0 && i + 1 < img.length) {
                    sum += img[i + 1][j - 1];
                    count += 1;
                }
                result[i][j] = sum / count;
            }
        }
        return result;
    }
}
