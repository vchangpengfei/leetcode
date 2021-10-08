package com.cpf.leetcode._14_longest_common_prefix;

class Solution {
    public static String longestCommonPrefix(String[] strs) {


        int cursor=0;
        StringBuilder sb=new StringBuilder();
        outer:
        while (true)
        {
            Character x=null;

            if(cursor<strs[0].length())
            {
                x=strs[0].charAt(cursor);
            }else{
                break ;
            }

            for(String s:strs)
            {
                if(s.length()<=cursor||x!=s.charAt(cursor))
                {
                    break outer;
                }
            }
            sb.append(x);
            cursor=cursor+1;
        }

        return sb.toString();
    }
}