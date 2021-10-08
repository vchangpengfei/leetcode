package com.cpf.leetcode._3_longest_substring_without_repeating_characters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void lengthOfLongestSubstring() {
        System.out.println(Solution.lengthOfLongestSubstring("tmmzuxt"));
        System.out.println(Solution.lengthOfLongestSubstring("abba"));
        System.out.println(Solution.lengthOfLongestSubstring("aab"));
        System.out.println(Solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(Solution.lengthOfLongestSubstring(" "));
        System.out.println(Solution.lengthOfLongestSubstring("pwwkew"));
        System.out.println(Solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(Solution.lengthOfLongestSubstring("bbbbb"));
        System.out.println(Solution.lengthOfLongestSubstring("aab"));
        System.out.println(Solution.lengthOfLongestSubstring("dvdf"));
    }
}