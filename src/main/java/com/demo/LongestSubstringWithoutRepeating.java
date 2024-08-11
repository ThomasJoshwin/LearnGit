package com.demo;
import java.util.HashMap;

public class LongestSubstringWithoutRepeating {

    public static String findLongestSubstring(String s) {
        int n = s.length();
        int start = 0, end = 0;
        int maxLength = 0;
        String result = "";

        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        while (end < n) {
            char c = s.charAt(end);
            if (charIndexMap.containsKey(c) && charIndexMap.get(c) >= start) {
                start = charIndexMap.get(c) + 1;
            }
            charIndexMap.put(c, end);
            int currentLength = end - start + 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
                result = s.substring(start, end + 1);
            }
            end++;
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "abcabcabc";
        String longestSubstring = findLongestSubstring(input);
        System.out.println("Longest Substring without Repeating Characters: " + longestSubstring);
    }
}
