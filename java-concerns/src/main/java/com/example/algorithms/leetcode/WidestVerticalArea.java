package com.example.algorithms.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/description
 */
public class WidestVerticalArea {

    public static int maxWidthOfVerticalArea(int[][] points) {
        int max = 0;

        Arrays.sort(points, Comparator.comparingInt(obj -> obj[0]));
        for (int i = 0; i < points.length - 1; i++) {
            if (points[i + 1][0] - points[i][0] > max) {
                max = points[i + 1][0] - points[i][0];
            }
        }

        return max;
    }
}
