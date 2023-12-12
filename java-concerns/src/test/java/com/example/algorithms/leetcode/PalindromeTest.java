package com.example.algorithms.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.algorithms.leetcode.Palindrome.isStringPalindrome;
import static com.example.algorithms.leetcode.Palindrome.reverseInteger;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @ParameterizedTest
    @MethodSource("palindromeNumbers")
    @DisplayName("Should return true when the input is a palindrome number")
    void isPalindromeWhenInputIsPalindromeNumber(int input) {
        assertTrue(Palindrome.isPalindrome(input));
        assertTrue(Palindrome.isPalindromeMath(input));
    }

    @ParameterizedTest
    @MethodSource("nonPalindromeNumbers")
    @DisplayName("Should return false when the input is not a palindrome number")
    void isPalindromeWhenInputIsNotPalindromeNumber(int input) {
        assertFalse(Palindrome.isPalindrome(input));
        assertFalse(Palindrome.isPalindromeMath(input));
    }

    @ParameterizedTest
    @MethodSource("inputExpectedOutput")
    void testReverseInteger(int input, int output) {
        int actual = reverseInteger(input);
        assertEquals(output, actual);
    }

    @ParameterizedTest
    @MethodSource("palindromeString")
    @DisplayName("Should return true when the input is a palindrome str")
    void testIsStringPalindromeWhenTrue(String input) {
        assertTrue(isStringPalindrome(input));
    }

    @ParameterizedTest
    @MethodSource("nonPalindromeString")
    @DisplayName("Should return false when the input is not a palindrome str")
    void testIsStringPalindromeWhenFalse(String input) {
        assertFalse(isStringPalindrome(input));
    }

    private static Stream<Arguments> palindromeNumbers() {
        return Stream.of(
                Arguments.of(121),
                Arguments.of(1112111),
                Arguments.of(11),
                Arguments.of(0),
                Arguments.of(9)
        );
    }

    private static Stream<Arguments> nonPalindromeNumbers() {
        return Stream.of(
                Arguments.of(12345),
                Arguments.of(-121),
                Arguments.of(123)
        );
    }

    private static Stream<Arguments> inputExpectedOutput() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(-12345, -54321),
                Arguments.of(12345, 54321),
                // Should return zero when the reversed integer exceeds the integer limit
                Arguments.of(1534236469, 0)
        );
    }

    private static Stream<Arguments> palindromeString() {
        return Stream.of(
                Arguments.of("A man, a plan, a canal, Panama!"),
                Arguments.of("A man, a plan, a canal, Panama"),
                Arguments.of("A man, a plan, a canal: Panama!"),
                Arguments.of(" "),
                Arguments.of("")
        );
    }

    private static Stream<Arguments> nonPalindromeString() {
        return Stream.of(
                Arguments.of("hello"),
                Arguments.of("race a car")
        );
    }
}