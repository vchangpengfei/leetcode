package com.cpf.leetcode._3_longest_substring_without_repeating_characters;


import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 示例 4:
 *
 * 输入: s = ""
 * 输出: 0
 *  
 *
 * 提示：
 *
 * 0 <= s.length <= 5 * 104
 * s 由英文字母、数字、符号和空格组成
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution {
    public static int lengthOfLongestSubstring(String s) {

        if(s.length()==0)
        {
            return 0;
        }

        char arr[]=s.toCharArray();

        HashMap<Character,Integer> positionMap=new HashMap<Character,Integer>();

        //定义滑动窗口
        int start=0,maxLen=0;

        for(int i=0;i<arr.length;i++)
        {
            Integer preIndex=positionMap.get(arr[i]);

            if(preIndex!=null)
            {
                start=Math.max(preIndex+1,start);
            }
            // 找到跟当前字符串重复的位置+1重新开始

            maxLen=Math.max(i-start+1,maxLen);

            positionMap.put(arr[i],i);
        }

        return maxLen;
    }



    public int lengthOfLongestSubstring1(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }

}



