package Stringss;

import java.util.*;

public class stringCompression {

    public static StringBuilder sc(String s) {
        /*
         * String newS = "";
         * for (int i = 0; i < s.length(); i++) {
         * Integer count = 1;
         * while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
         * count++;
         * i++;
         * }
         * newS += s.charAt(i);
         * if (count > 1) {
         * newS += count.toString();
         * }
         * 
         * }
         */

        StringBuilder sc = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            Integer count = 1;
            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            sc.append(s.charAt(i));
            if (count > 1) {

                sc.append(count.toString());
            }
        }

        return sc;
    }

    public static void main(String[] args) {
        String str = new Scanner(System.in).next();

        System.out.println(sc(str));
    }
}
