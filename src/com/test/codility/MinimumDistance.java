package com.test.codility;

import java.util.Arrays;

public class MinimumDistance {
    public static void main(String[] args) {
        int[] intArray = new int[]{ 8,24,3,20,1,17};
        System.out.println(solution(intArray));
    }

    private static int solution(int[] A) {

        if(A.length <2){
            return 0;
        }

        Arrays.sort(A);
        int minDistance = A[1] -A[0];
        for (int i = 2; i <A.length -1; i ++){
            minDistance = Math.min(minDistance, A[i] - A[i-1]);
        }
        return minDistance;
    }
}
