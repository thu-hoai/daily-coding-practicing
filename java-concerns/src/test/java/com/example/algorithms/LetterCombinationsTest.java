package com.example.algorithms;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static com.example.algorithms.LetterCombinations.letterCombinations;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LetterCombinationsTest {

    @ParameterizedTest
    @MethodSource("inputExpectedOutput")
    void testLetterCombinations(String input, List<String> expected) {
        List<String> actual = letterCombinations(input);
//        assertEquals(expected, actual);
    }

    private static Stream<Arguments> inputExpectedOutput() {
        return Stream.of(
                Arguments.of("23", List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")),
                Arguments.of("", List.of()),
                Arguments.of("2", List.of("a", "b", "c"))
        );
    }
}
