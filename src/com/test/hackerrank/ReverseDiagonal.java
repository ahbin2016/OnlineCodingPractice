package com.test.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseDiagonal {
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();

        int[] array3 = {1, 2, 3};
        int[] array4 = {4, 5, 6};
        int[] array5 = {7, 8, 9};

        matrix.add(Arrays.stream(array3).boxed().collect(Collectors.toList()));
        matrix.add(Arrays.stream(array4).boxed().collect(Collectors.toList()));
        matrix.add(Arrays.stream(array5).boxed().collect(Collectors.toList()));

        printAntiDiag(matrix);
    }

    private static void printAntiDiag(List<List<Integer>> matrix) {
        int N = matrix.size();
        // printing elements above and on second diagonal
        for (int i = N - 1; i >= 0; i--) {
            // traversing downwards starting from the last column
            int row = 0, col = i;
            while (col < N) {
                System.out.println(matrix.get(row).get(col));
                row++;
                col++;
            }
        }
        // printing elements below second diagonal
        for (int j = 1; j < N; j++) {
            // traversing downwards starting from first column
            int col = 0, row = j;
            while (row < N) {
                System.out.println(matrix.get(row).get(col));
                row++;
                col++;
            }
        }
    }

    //Time Complexity is O(n2)
}
