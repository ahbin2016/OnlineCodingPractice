package com.test.codility;

public class FindEvenNumberSum {


    public int solution(int[] A) {
        // write your code in Java SE 8
        int count = 0;
        int size = A.length;

        for(int i = 0; i < size; i ++) {

            int sum = 0;
            int firstInt = A[i];

            for (int j = i + 1; j < size; j ++) {

                int secondInt = A[j];
                sum = firstInt + secondInt;

                if ( sum % 2 == 0) {
                    count += 1;
                }
            }
        }


        return count;

    }

    public static void main (String[] args) {

        FindEvenNumberSum fens = new FindEvenNumberSum();

        int[] Arr = {2,1,5,-6,9};



        System.out.println(fens.solution(Arr));
    }

}
