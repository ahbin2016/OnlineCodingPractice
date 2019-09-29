package com.test.codility;

public class NumberOfPairsWithEvenSum {
    public static void main(String[] args) {
        int[] intArray = new int[]{ 2,1,5,-6,9};
        System.out.println(solution(intArray));
    }

    private static int solution(int[] A) {
        int numberOfPair = 0;
        for(int i =0; i <A.length; i++){
            int first = A[i];
            for(int j= i+1; j<A.length; j++){
                int second = A[j];
                if((first + second) % 2 == 0){
                    numberOfPair ++;
                }
            }
        }
        if (numberOfPair > 1000000000){
            return -1;
        }else {
            return numberOfPair;
        }
    }
}
