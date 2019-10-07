package com.test.hackerrank;

public class ConsecutiveSum {
    public static void main(String[] args) {
        long num = 15;
        System.out.println(consecutiveSum(num));
    }

    private static int consecutiveSum(long num) {
        int count = 0;
        for (int start = 1; start <= num; ++start) {
            long target = num;
            long x = start;
            while (target > 0)
                target -= x++;
            if (target == 0) count++;
        }
        return count-1;
    }
}
