package org.leetcode.valid_anagram;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));

        System.out.println(isAnagram2("anagram", "nagaram"));
        System.out.println(isAnagram2("rat", "car"));

        System.out.println(isAnagram3("anagram", "nagaram"));
        System.out.println(isAnagram3("rat", "car"));



        System.out.println("ana".charAt(1) - 'a');
        System.out.println(Character.getNumericValue('a'));
        System.out.println(Character.getNumericValue('n'));
    }

    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        var sArr = s.toCharArray();
        var tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }

    static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] array = new int[26]; //26 символов в алфавите
        for(int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a'; //порядковый номер буквы относительно а
            array[index]++; //инкрементируем сколько раз встретилась буква в слове
        }
        for (int i = 0; i < t.length(); i++) {
            int index = t.charAt(i) - 'a';
            array[index]--;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) return false;
        }

        return true;
    }

    static boolean isAnagram3(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] array = new int[26]; //26 символов в алфавите
        for(int i = 0; i < s.length(); i++) {
            array[s.charAt(i) - 'a']++; //инкрементируем сколько раз встретилась буква в слове
            array[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) return false;
        }

        return true;
    }
}
