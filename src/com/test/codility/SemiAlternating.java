package com.test.codility;

public class SemiAlternating {

  public static void main(String[] args) {

    String s = "abaaaa"; //
    System.out.println(solutions(s));
  }

  private static int solutions(String s) {

    int maxCount = 3;
    int length = s.length();
    if (length < maxCount) {
      return length;
    }
    int count = 1, result = 1;
    for (int i = 1; i < length - 1; ++i) {
      if (s.charAt(i - 1) == s.charAt(i) && s.charAt(i + 1) == s.charAt(i)) {
        result = Math.max(result, count + 1);
        count = 1;
      } else {
        count++;
      }
    }
    return Math.max(result, count + 1);
  }
}
