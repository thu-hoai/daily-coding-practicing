package com.example.algorithms;

import java.util.*;

public class TaxiFare {

  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    System.out.println(calculateTaxiFare(n));
  }

  public static Integer calculateTaxiFare(Integer n) {

    List<Integer> test = new ArrayList<>();
    test.add(15000);
    test.add(13500);
    test.add(11000);
    Integer sum = 0;
    if (n <= 1) {
      return test.get(0);
    }
    sum = test.get(0);
    if (n < 5) {
      sum = sum + n * test.get(1);
      return sum;
    }
    sum = sum + 4 * test.get(1) + (n - 4) * test.get(2);
    return sum;
  }
}
