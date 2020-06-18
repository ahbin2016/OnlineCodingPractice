package com.test.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumMinimumAbsoluteDifference {

    public static void main(String[] args) {
        Integer[] given = {5,1,3,7,3};
        List<Integer> arr = Arrays.asList(given);
        int result = minDiff(arr);
        System.out.println(result);
    }

    private static int minDiff(List<Integer> arr) {
        Collections.sort(arr);
        int sum = 0;

        for(int i = 0; i < arr.size()-1; i++){
            sum+=Math.abs(arr.get(i) - arr.get(i+1));
        }
        return sum;
    }
}
