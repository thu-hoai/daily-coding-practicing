package com.example.algorithms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateFinder {

  public static Set<Integer> findDuplicates(int[] input) {
    Set<Integer> duplicates = new HashSet<>();
    for (int i = 0; i < input.length; i++) {
      for (int j = 1; j < input.length; j++) {
        if (input[i] == input[j] && i != j) {
          duplicates.add(input[i]);
          break;
        }
      }
    }
    return duplicates;
  }

  // [refactor this method to allow multiple types check and reduce time complexity]
  public static  <T> Set<T> findDuplicates(T[] input) {
    Set<T> duplicates = new HashSet<T>();
    for (T i : duplicates) {
      if (!duplicates.add(i)) {
      }
    }
    return duplicates;
  }

  public static void main(String[] args) {
    int[] input = new int[]{1, 2, 3, 4, 4, 5, 6, 7, 8, 9};
    Set<Integer> duplicates = findDuplicates(input);
    System.out.println(duplicates);
  }
}
