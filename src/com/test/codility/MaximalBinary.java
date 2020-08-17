package com.test.codility;

public class MaximalBinary {

  public static void main(String[] args) {
    //
      int[]A = {0,1,1,1,0,1,1,1,0,1};
      int[]B = {0,0};
      int[]C = {1,0};

    System.out.println(solutions(C));
  }

    private static int solutions(int[] A) {
      int n = A.length;
      int i = n-1;
      int result = -1;
      int k =0;
      int maximal = 0;

      while (i > 0){
          if (A[i] == 1){
              k = k +1;
              if(k >= maximal){
                  maximal = k;
                  result = i;
              }
          }
          else
              k = 0;
              i = i -1;

      }
      if(A[i] == 1 && k+1 > maximal){
          result = 0;
      }
      return result;
    }
}
