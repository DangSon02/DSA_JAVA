package com.hubberspot.dsalgo.mathematics;

public class Palindrome {

    // static boolean isPalindrome(String s) {

    // String palindrome = "";

    // for (int i = s.length() - 1; i >= 0; i--) {

    // palindrome = palindrome + s.charAt(i);

    // }

    // if (palindrome.equals(s)) {
    // return true;
    // } else {

    // return false;
    // }

    // }

    static boolean isPalindrome(String s) {

        char[] charArr = s.toCharArray();

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {

            if (charArr[start] != charArr[end]) {
                return false;
            }

            start++;
            end--;

        }

        return true;

    }

    public static void main(String[] args) {
        String s = "that";

        System.out.println("Is palindrome:: " + isPalindrome(s));
    }

}
