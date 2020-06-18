package com.test.codility;

public class SimpleNumberEncryption {


    public int solution(int A) {

        String numberString = String.valueOf(A);
        int length = numberString.length();

        StringBuilder sb = new StringBuilder();

        for( int f = 0,  b = (length - 1); b >= f; f++, b--) {

            sb.append(numberString.substring(f, f + 1));
            if (b == f) break;
            sb.append(numberString.substring(b, b + 1));

        }

        return Integer.parseInt(sb.toString());
    }

    public static void main (String[] args) {

        SimpleNumberEncryption ct = new SimpleNumberEncryption();

        System.out.println(ct.solution(12312312));
    }
}
