package com.example.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class LetterCombinations {


    /**
     * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
     * https://leetcode.com/problems/letter-combinations-of-a-phone-number/solutions/2021106/4-approaches-bf-4-loops-backtracking-bfs-queue-with-image-explanation/
     * @param digits
     * @return
     */
    public static List<String> letterCombinations(String digits) {

        List<String> res = new ArrayList<>();
        Map<Integer, List<Character>> map = new HashMap<>();

        map.put(2, List.of('a', 'b', 'c'));
        map.put(3, List.of('d', 'e', 'f'));
        map.put(4, List.of('g', 'h', 'i'));
        map.put(5, List.of('j', 'k', 'l'));
        map.put(6, List.of('m', 'n', 'o'));
        map.put(7, List.of('p', 'q', 'r', 's'));
        map.put(8, List.of('t', 'u', 'v'));
        map.put(9, List.of('w', 'x', 'y', 'z'));

//        var test = Stream.of(digits.toCharArray()).
        return null;
    }
}
