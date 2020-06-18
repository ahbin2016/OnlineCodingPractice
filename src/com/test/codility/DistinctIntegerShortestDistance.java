package com.test.codility;

public class DistinctIntegerShortestDistance {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int size = A.length;
        int shortestDistance = -1;
        int distance = 0;

        for (int p = 0; p < size; p++) {

            for (int q = 0; q < size; q++) {

                if (p != q) {
                    if ((A[p] - A[q]) >= 0) {

                        distance = A[p] - A[q];

                    } else if (A[p] - A[q] < 0) {

                        distance = A[q] - A[p];
                    }

                    if (shortestDistance == -1 || distance < shortestDistance) {
                        shortestDistance = distance;

                    }
                }
            }

        }

        return shortestDistance;
    }

    public static void main (String[] args) {

        DistinctIntegerShortestDistance d = new DistinctIntegerShortestDistance();

        int[] Arr = {8,24,3,20,1,17};



        System.out.println(d.solution(Arr));
    }

}
