package com.test.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";
        String note = "visa";
        System.out.println(canConstructLetter(text, note));
    }

    private static boolean canConstructLetter(String text, String note) {
        text = text.toLowerCase();
        text = text.replaceAll("\\s+","");
        note = note.toLowerCase();
        note = note.replaceAll("\\s+","");
        Map<Character, Integer> usableLetters = new HashMap<>();

        // populate a map with letters and frequencies of String text
        for(int i = 0; i < text.length(); i ++){
            char letter = text.charAt(i);
            if( ! usableLetters.containsKey(letter)){
                usableLetters.put( letter, 1 );
            } else {
                Integer frequency = usableLetters.get( letter );
                usableLetters.put( letter, ++frequency );
            }
        }

        // test each letter in note a against data in the map
        // return false if letter is absent in the map or its  frequency is 0
        for (int k = 0; k < note.length(); k++) {
            char letter = note.charAt(k);
            if( ! usableLetters.containsKey( letter ) ){
                return false;
            }
        }
        return true;
    }
}
