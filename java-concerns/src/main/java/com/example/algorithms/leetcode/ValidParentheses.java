package com.example.algorithms.leetcode;

import java.util.*;

public class ValidParentheses {

    /**
     * Check Valid Parentheses
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Every close bracket has a corresponding open bracket of the same type.
     *
     * @param s - containing just the characters '(', ')', '{', '}', '[' and ']'
     * @return true - if the input string is valid. Otherwise false
     */
    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('[', ']');
        brackets.put('{', '}');

        for (Character character : s.toCharArray()) {
            if (brackets.containsKey(character)) {
                stack.push(character);
            } else if (brackets.containsValue(character)) {
                if (stack.isEmpty()) {return false;}
                if (!Objects.equals(character, brackets.get(stack.pop()))) return false;
            }
        }
        return stack.isEmpty();
    }
}
