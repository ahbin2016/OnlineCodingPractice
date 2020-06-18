package com.test.hackerrank;

import java.util.Arrays;
import java.util.List;

public class EmployeeMaxStreak {

    public static void main(String[] args) {
        int m = 3;
        String [] data = {"YYY", "YYY", "YNN", "YYN", "YYN"};
        int result = maxStreak(m, Arrays.asList(data));
        System.out.println(result);
    }

    private static int maxStreak(int m, List<String> data) {
        int days = 0;

        for(int i = 0; i < data.size()-1; i++){
            if(!data.get(i).contains("N")){
                days = days +1;
            }
        }

        return days;
    }
}
