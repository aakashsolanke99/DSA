package org.aakash.Recursion;

public class PalindromString {
    public static void main(String[] args) {
        String s = "mahdam";
        System.out.println(palindrom(0, s));
    }

    private static boolean palindrom(int i, String s) {
        if (i >= s.length() / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }

        return palindrom(i + 1, s);
    }

}