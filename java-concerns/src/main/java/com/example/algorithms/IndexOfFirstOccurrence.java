package com.example.algorithms;

import java.util.HashMap;
import java.util.Map;

public class IndexOfFirstOccurrence {

    public static int getIndexOfFirstOccurrence1(String str1, String str2) {
        return str1.indexOf(str2);
    }

    public static int getIndexOfFirstOccurrence(String str1, String str2) {

        Map<Integer, String> res = new HashMap<>();
        int firstChar = str2.charAt(0);
        for (int i = 0; i < str1.length(); i++) {
            if (firstChar == str1.charAt(i) && (str1.length() - i >= str2.length())) {
                String subString = str1.substring(i, i + str2.length());
                res.put(i, subString);
            }
        }
        for (Map.Entry<Integer, String> entry : res.entrySet()) {
            if (entry.getValue().equals(str2)) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
