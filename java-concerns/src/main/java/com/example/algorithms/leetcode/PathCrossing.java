package com.example.algorithms.leetcode;

import java.util.*;

/**
 * Check if the given path crosses itself
 * https://leetcode.com/problems/path-crossing/description
 */
public class PathCrossing {
    public static boolean isPathCrossingO2List(String path) {
        List<int[]> coordinates = new ArrayList<>();
        coordinates.add(new int[]{0, 0});

        char[] chars = path.toCharArray();
        for (char character : chars) {
            int[] current = getCurrentCoordinator(character, coordinates.get(coordinates.size() - 1));
            if (isCoordinatorsMatching(current, coordinates)) {
                return true;
            } else {
                coordinates.add(current);
            }
        }
        return false;
    }

    public static boolean isPathCrossingSet(String path) {
        Set<String> visited = new HashSet<>();
        visited.add("0,0");

        char[] chars = path.toCharArray();
        int x = 0;
        int y = 0;

        for (char character : chars) {
            switch (character) {
                case 'N': y++; break;
                case 'S': y--; break;
                case 'E': x++; break;
                case 'W': x--; break;
            }
            String next = x + "," + y;
            if (!visited.add(next)) {
                return true;
            }
        }
        return false;
    }

    private static int[] calculateCoordinators(int[] c1, int[] c2) {
        return new int[]{c1[0] + c2[0], c1[1] + c2[1]};
    }

    private static boolean isCoordinatorsMatching(int[] c1, List<int[]> arr) {
        for (int[] c : arr) {
            if (c1[0] == c[0] && c1[1] == c[1]) {
                return true;
            }
        }
        return false;
    }

    private static int[] getCurrentCoordinator(char character, int[] previous) {
        Map<Character, int[]> map = new HashMap<>();
        map.put('N', new int[]{0, 1});
        map.put('E', new int[]{1, 0});
        map.put('S', new int[]{0, -1});
        map.put('W', new int[]{-1, 0});
        return calculateCoordinators(map.get(character), previous);
    }
}
