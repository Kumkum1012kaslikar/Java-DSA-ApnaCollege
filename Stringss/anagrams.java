package Stringss;

import java.util.*;

public class anagrams {

    public static boolean sc(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() == s2.length()) {
            char s11[] = s1.toCharArray();
            char s12[] = s2.toCharArray();

            Arrays.sort(s11);
            Arrays.sort(s12);

            boolean result = Arrays.equals(s11, s12);
            if (result) {
                return true;
            } else {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "care";
        System.out.println(s1 + " and " + s2 + " are anagram of each other ? ");
        System.out.println(sc(s1, s2));

    }
}
