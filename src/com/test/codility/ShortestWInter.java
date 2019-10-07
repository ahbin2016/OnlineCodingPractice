package com.test.codility;

public class ShortestWInter {
    public static void main(String[] args) {
        int T[] = {5, -2, 3, 8, 6 };
        int A[] = {-5, -5, -5, -42, 6 , 12};
        System.out.println(solution(T));
        System.out.println(solution(A));
    }

    public static int solution(int[] T) {

        int leftMax = T[0];
        int maximum = T[0];
        int winterLength = 1;

        int n = T.length;

        for(int i = 1; i < n; i++) {
            if (T[i] < leftMax) {
                winterLength = i+1;
                leftMax = maximum;
            } else if (T[i] > maximum) {
                maximum = T[i];
            }
        }
        return winterLength;
    }
}
