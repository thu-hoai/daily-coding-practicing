package com.example.algorithms.leetcode;

public class LastWordLength {

    public static int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int lengthLastWord = 0;
        while (i >= 0) {
            if (s.charAt(i) == ' ' && i != s.length() - 1 && s.charAt(i + 1) != ' ') return lengthLastWord;
            if (s.charAt(i) != ' ') {
                lengthLastWord++;
            }
            i--;
        }
        return lengthLastWord;
    }
}
