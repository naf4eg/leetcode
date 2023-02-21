package org.leetcode.valid_palindrome;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        var text1 = "A man, a plan, a canal: Panama";
        var text2 = "race a car";
        var text3 = " ";
        var text4 = ".,";
        var solution = new Solution();
//        var isPalindrome1 = solution.isPalindrome2(text1);
//        var isPalindrome2 = solution.isPalindrome2(text2);
//        var isPalindrome3 = solution.isPalindrome2(text3);
        var isPalindrome4 = solution.isPalindrome2(text4);


//        System.out.println(isPalindrome1);
//        System.out.println(isPalindrome2);
//        System.out.println(isPalindrome3);
        System.out.println(isPalindrome4);
    }

    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return false;
        }
        var chars = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        var length = chars.length;
        var begin = 0;
        var end = length-1;

        while (begin < end) {
            if (chars[begin] != chars[end]) {
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }

    public boolean isPalindrome2(String s) {
        if (s.isEmpty()) {
            return false;
        }
        var chars = s.toLowerCase().toCharArray();
        var length = chars.length;
        var begin = 0;
        var end = length-1;

        while (begin != length-1 && end != 0) {
            while (!Character.isLetterOrDigit(chars[begin])) begin++;
            while (!Character.isLetterOrDigit(chars[end])) end--;

            if (chars[begin] != chars[end]) {
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }
}
