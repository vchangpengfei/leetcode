package com.cpf.leetcode._69_sqrtx;

/**
 * 给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
 *
 * 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
 *
 * 注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：x = 4
 * 输出：2
 * 示例 2：
 *
 * 输入：x = 8
 * 输出：2
 * 解释：8 的算术平方根是 2.82842..., 由于返回类型是整数，小数部分将被舍去。
 *  
 *
 * 提示：
 *
 * 0 <= x <= 231 - 1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sqrtx
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution {
    /**
     * 内存溢出 需要用long
     * @param x
     * @returne   e
     */
    public static int mySqrt(int x) {

        int start=0;

        int end=x;

        while (end-start>0)
        {
            int cha=end-start;
            int mid=start+((cha%2==0)?(cha/2):(cha/2+1));

            if(((long)mid*mid<x&&(long)(mid+1)*(mid+1)>x)||((long)mid*mid==x))
            {
                return mid;
            }else if((long)(mid+1)*(mid+1)<=x)
            {
                start=mid;
            }else if((long)mid*mid>x){
                end=mid;
            }else {
                System.out.println("---------------");
            }
        }


        return 0;
    }
}