package com.test.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class BuyingShowTickets {
    public static void main(String[] args) {
        // write your code here
        List<Integer> test = new ArrayList<>();
        test.add(2);
        test.add(6);
        test.add(3);
        test.add(4);
        test.add(5);

        System.out.println(totalTime(test, 2));
    }

    /*
     * Complete the 'waitingTime' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY tickets
     *  2. INTEGER p
     */

    private static long totalTime(List<Integer> tickets, int p) {
        long totalTime = 0L;
        final int size = tickets.size();
        boolean done = false;
        while (!done) {
            for (int i = 0; i < size; i++) {
                if (tickets.get(i) == 0) {
                    continue;
                }
                if (tickets.get(p) == 0) {
                    done = true;
                    break;
                }
                tickets.set(i, tickets.get(i) - 1);
                totalTime++;
            }
        }
        return totalTime;
    }
    }
