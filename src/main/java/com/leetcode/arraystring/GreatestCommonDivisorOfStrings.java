package com.leetcode.arraystring;

import java.sql.SQLOutput;

/*For two strings s and t, we say "t divides s"
if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
===================================================================================================
Example 1:Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
===================================================================================================
Example 2:
Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
===================================================================================================
Example 3:
Input: str1 = "LEET", str2 = "CODE"
Output: ""
===================================================================================================
Constraints:
1 <= str1.length, str2.length <= 1000
str1 and str2 consist of English uppercase letters. */
public class GreatestCommonDivisorOfStrings {
    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public String gcdOfStrings(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        int lent1 = str1.length();
        int lent2 = str2.length();
        if (!(str1 + str2).equals(str2 + str1)) return "";
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }
    public static void main(String[] args) {
        GreatestCommonDivisorOfStrings gcd = new GreatestCommonDivisorOfStrings();
       String result = gcd.gcdOfStrings("ABCABC", "ABC");
        System.out.println(result);
    }
}
