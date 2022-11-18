package com.example.WordWrap;

public class WordWrap {

    public static String wrapper(String s, int i) {
        if (s.length() == 0 || i < 1) {
            throw new IllegalArgumentException("give a valid input");
        }
        if (s.length() > i) {
            s = s.substring(0, i) + "\n" + wrapper(s.substring(i),i);
        }
        return s;
    }
}
