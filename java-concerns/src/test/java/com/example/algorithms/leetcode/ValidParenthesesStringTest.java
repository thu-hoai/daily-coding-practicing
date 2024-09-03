package com.example.algorithms.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidParenthesesStringTest {

    @ParameterizedTest
    @MethodSource("inputExpectedOutput")
    void testIsValidParentheses(String string, boolean expected) {
        assertEquals(expected, ValidParenthesesString.checkValidString(string));
    }

    private static Stream<Arguments> inputExpectedOutput() {
        return Stream.of(
                Arguments.of("()", true),
                Arguments.of("(", false),
                Arguments.of("(*))", true),
                Arguments.of("(*)", true),
                Arguments.of("(((((*)))**", true),
                Arguments.of("((((()))**", true),
                Arguments.of("(***", true),
                Arguments.of("(()", false),
                Arguments.of("((((()(()()()*()(((((*)()*(**(())))))(())()())(((())())())))))))(((((())*)))()))(()((*()*(*)))(*)()",
                        true)
        );
    }
}