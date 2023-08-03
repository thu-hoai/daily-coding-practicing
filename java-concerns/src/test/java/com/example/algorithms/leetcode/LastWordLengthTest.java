package com.example.algorithms.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.algorithms.leetcode.LastWordLength.lengthOfLastWord;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LastWordLengthTest {

    @ParameterizedTest
    @MethodSource("inputExpectedOutput")
    void testLengthOfLastWord(String input, int expected) {
        int actual = lengthOfLastWord(input);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> inputExpectedOutput() {
        return Stream.of(
                Arguments.of("",  0),
                Arguments.of("Hello World",  5),
                Arguments.of("   fly me   to   the moon  ",  4),
                Arguments.of("luffy is still joyboy",  6)
        );
    }
}
