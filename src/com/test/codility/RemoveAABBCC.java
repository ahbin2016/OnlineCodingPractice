package com.test.codility;

public class RemoveAABBCC {

    public String solution(String S) {
        // write your code in Java SE 8

        String returnVal = S;
        boolean contains = true;

        while(contains) {

            if (returnVal.contains("AA")) {
                returnVal = returnVal.replaceAll("AA", "");
            } else if (returnVal.contains("BB")) {
                returnVal = returnVal.replaceAll("BB", "");
            } else if (returnVal.contains("CC")) {
                returnVal = returnVal.replaceAll("CC", "");
            } else {
                contains = false;
            }

        }

        return returnVal;

    }

    public static void main (String[] args) {

        RemoveAABBCC d = new RemoveAABBCC();

        String in = "ACCAABBBC";



        System.out.println(d.solution(in));
    }

}
