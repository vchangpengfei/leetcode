package com.cpf.leetcode._67_add_binary;

/**
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *  
 *
 * 提示：
 *
 * 每个字符串仅由字符 '0' 或 '1' 组成。
 * 1 <= a.length, b.length <= 10^4
 * 字符串如果不是 "0" ，就都不含前导零。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-binary
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution {
    public static String addBinary(String a, String b) {

        int ac=a.length()-1;

        int bc=b.length()-1;

        StringBuilder sb=new StringBuilder();

        boolean isover=false;

        while (ac>=0||bc>=0)
        {
            int ta=0;

            if(ac>=0)
            {
                ta=a.charAt(ac)=='1'?1:0;
            }

            int tb=0;

            if(bc>=0)
            {
                tb=b.charAt(bc)=='1'?1:0;
            }

            int xx=ta+tb+(isover?1:0);

            if(xx==2)
            {
                sb.insert(0,'0');
                isover=true;
            }else if(xx==3){
                sb.insert(0,'1');
                isover=true;
            }else {
                sb.insert(0,xx);
                isover=false;
            }


            ac=ac-1;

            bc=bc-1;

        }

        if(isover)
        {
            sb.insert(0,'1');
        }

        return sb.toString();

    }
}