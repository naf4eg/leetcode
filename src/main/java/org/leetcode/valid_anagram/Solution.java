package org.leetcode.valid_anagram;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }

    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        var sArr = s.toCharArray();
        var tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }
}
