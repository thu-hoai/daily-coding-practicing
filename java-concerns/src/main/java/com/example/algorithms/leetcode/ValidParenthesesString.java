package com.example.algorithms.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Given a string s containing only three types of characters: '(', ')' and '*',
 * return true if s is valid.
 *
 * The following rules define a valid string:
 *
 * Any left parenthesis '(' must have a corresponding right parenthesis ')'.
 * Any right parenthesis ')' must have a corresponding left parenthesis '('.
 * Left parenthesis '(' must go before the corresponding right parenthesis ')'.
 * '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".
 */
public class ValidParenthesesString {
    public static boolean checkValidString(String s) {
        int openBracketCount = 0;
        int closedBracketCount = 0;
        int l = 0;
        int r = s.length() - 1;

        while (l < s.length()) {
            if (s.charAt(l) == '(' || s.charAt(l) == '*') {
                openBracketCount ++;
            } else {
                openBracketCount --;
            }

            if (s.charAt(r) == ')' || s.charAt(r) == '*') {
                closedBracketCount ++;
            } else {
                closedBracketCount --;
            }
            l++;
            r--;

            if (openBracketCount < 0 || closedBracketCount < 0) {
                return false;
            }
        }
        return true;
    }
}
