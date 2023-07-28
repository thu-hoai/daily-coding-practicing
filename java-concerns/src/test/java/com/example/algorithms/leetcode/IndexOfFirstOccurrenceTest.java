package com.example.algorithms.leetcode;

import com.example.algorithms.leetcode.IndexOfFirstOccurrence;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IndexOfFirstOccurrenceTest {

    @ParameterizedTest(name = "{index} {0}")
    @MethodSource("string1String2ExpectedOutput")
    void testIndexOfFirstOccurrence(String name, String str1, String str2, int expected) {
        int result = IndexOfFirstOccurrence.getIndexOfFirstOccurrence(str1, str2);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> string1String2ExpectedOutput() {
        return Stream.of(
                Arguments.of("Should return -1 when the first string is empty", "", "abc", -1),
                Arguments.of("Should return -1 when the second string is not present in the first string", "leetcode", "leeto", -1),
                Arguments.of("Should return -1 when the second string is not fully present in the first string", "aaa", "aaaa", -1),
                Arguments.of("Should return 0 when the first string starts with the second string", "mississippi", "miss", 0),
                Arguments.of("Should return the correct index", "mississippi", "issip", 4),
                Arguments.of("Should return the correct index", "a", "a", 0),
                Arguments.of("Should return the correct index", "hello world", "o", 4)
        );
    }
}