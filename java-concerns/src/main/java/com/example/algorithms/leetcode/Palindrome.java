package com.example.algorithms.leetcode;

public class Palindrome {

    /**
     * https://leetcode.com/problems/palindrome-number/
     */
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int left = 0;
        String s = String.valueOf(x);
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * https://leetcode.com/problems/palindrome-number/
     */
    public static boolean isPalindromeMath(int x) {
        if (x < 0) {
            return false;
        }

        int initial = x;
        int temp = 0;

        while (x > 0) {
            int digit = x % 10;
            temp = temp * 10 + digit;
            x /= 10;
        }

        return initial == temp;
    }


    /**
     * https://leetcode.com/problems/reverse-integer/
     */
    public static int reverseInteger(int x) {
        int reverse = 0;
        while (x != 0) {
            if (reverse > Integer.MAX_VALUE / 10 || reverse < Integer.MIN_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        return reverse;
    }

    /**
     * https://leetcode.com/problems/valid-palindrome/
     */
    public static boolean isStringPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        String stringLowerCase = s.toLowerCase();

        while (left < right) {
            char leftChar = stringLowerCase.charAt(left);
            char rightChar = stringLowerCase.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else if (leftChar != rightChar) {
                return false;
            } else {
                right--;
                left++;
            }
        }
        return true;

    }
}
