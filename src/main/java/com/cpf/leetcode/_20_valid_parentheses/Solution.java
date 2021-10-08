package com.cpf.leetcode._20_valid_parentheses;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *  
 *
 * 示例 1：
 *
 * 输入：s = "()"
 * 输出：true
 * 示例 2：
 *
 * 输入：s = "()[]{}"
 * 输出：true
 * 示例 3：
 *
 * 输入：s = "(]"
 * 输出：false
 * 示例 4：
 *
 * 输入：s = "([)]"
 * 输出：false
 * 示例 5：
 *
 * 输入：s = "{[]}"
 * 输出：true
 *  
 *
 * 提示：
 *
 * 1 <= s.length <= 104
 * s 仅由括号 '()[]{}' 组成
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution {
    public static boolean isValid(String s) {

        Stack<Character> stack=new Stack<Character>();

        char sarr[]=s.toCharArray();

        int cursor=0;

        while (cursor<sarr.length)
        {
            if(sarr[cursor]=='('||sarr[cursor]=='{'||sarr[cursor]=='[')
            {
                stack.push(sarr[cursor]);

                cursor=cursor+1;

                continue;
            }

            if(sarr[cursor]==')')
            {
                if(stack.size()!=0&&stack.pop()=='(')
                {
                    cursor=cursor+1;

                    continue;
                }
                else {
                    return false;
                }
            }

            if(sarr[cursor]==']')
            {

                if(stack.size()!=0&&stack.pop()=='[')
                {
                    cursor=cursor+1;

                    continue;
                }
                else {
                    return false;
                }
            }

            if(sarr[cursor]=='}')
            {
                if(stack.size()!=0&&stack.pop()=='{')
                {
                    cursor=cursor+1;

                    continue;
                }
                else {
                    return false;
                }
            }


        }

        if(stack.size()==0)
        {
            return true;
        }else {
            return false;
        }

    }
}