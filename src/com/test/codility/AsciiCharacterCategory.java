package com.test.codility;

public class AsciiCharacterCategory {


    public String solution(String s) {
        char c = s.charAt(0);
        if (c > 64 && c < 91) {  // please fix condition
            return "upper";
        } else if (c > 96 && c < 123) {  // please fix condition
            return "lower";
        } else if (c > 47 && c < 58) {  // please fix condition
            return "digit";
        } else {
            return "other";
        }
    }

    public static void main (String[] args) {

        AsciiCharacterCategory ct = new AsciiCharacterCategory();

        System.out.println(ct.solution("9"));
    }

}
