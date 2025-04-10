package com.leetcode.arraystring;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int lent1 = word1.length();
        int lent2 = word2.length();
        int maxLen = Math.max(lent1, lent2);


        for(int i = 0; i < maxLen ; i++) {
            if (i < lent1) sb.append(word1.charAt(i));
            if (i < lent2) sb.append(word2.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        MergeStringsAlternately m = new MergeStringsAlternately();
         String result = m.mergeAlternately("abcd", "uioklhg");
        System.out.printf(result);
    }
}
