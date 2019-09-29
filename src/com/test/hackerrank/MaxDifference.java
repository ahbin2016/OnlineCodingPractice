package com.test.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class MaxDifference {

    public static void main(String[] args) {
	// write your code here
        List<Integer> test = new ArrayList<>();
        test.add(7);
        test.add(2);
        test.add(3);
        test.add(10);
        test.add(2);
        test.add(4);
        test.add(8);
        test.add(1);

        System.out.println(maxDifference(test));
    }

    /*
     * Complete the 'maxDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int maxDifference(List<Integer> arr) {
        // Write your code here
        int min = arr.get(0);
        int diff = -1;

        for (int i = 1; i < arr.size(); ++i) {
            if (arr.get(i)> min) diff = Math.max(arr.get(i) - min, diff);
            min = Math.min(min, arr.get(i));
        }
       return diff;
    }
}
