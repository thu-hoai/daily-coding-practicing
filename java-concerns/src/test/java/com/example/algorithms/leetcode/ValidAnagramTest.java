package com.example.algorithms.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidAnagramTest {

    @ParameterizedTest
    @MethodSource("inputStringsExpectedOutput")
    void isAnagramTest(String str1, String str2, boolean expectedOutput) {
        assertEquals(expectedOutput, ValidAnagram.isAnagram(str1, str2));
    }

    public static Stream<Arguments> inputStringsExpectedOutput() {
        return Stream.of(
                Arguments.of("anagram", "nagaram", true),
                Arguments.of("rat", "car", false)
        );
    }
}
