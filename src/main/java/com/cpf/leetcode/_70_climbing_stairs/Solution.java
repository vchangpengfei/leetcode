package com.cpf.leetcode._70_climbing_stairs;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * 示例 1：
 *
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 示例 2：
 *
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/climbing-stairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution {
    public static int climbStairs(int n) {
        if(n==1)
        {
            return 1;
        }

        if(n==2)
        {
            return 2;
        }

        return climbStairs(n-1)+climbStairs(n-2);
    }

    public static int climbStairs1(int n) {
        int memo[]=new int[n+1];
        return climbStairsMemo(n,memo);
    }

    public static int climbStairsMemo(int n, int[] memo) {

        if(memo[n]>0)
        {
            return memo[n];
        }
        if(n==1)
        {
            memo[1]= 1;
        }else if(n==2)
        {
            memo[2]= 2;
        }else {
            memo[n]=climbStairsMemo(n-1,memo)+climbStairsMemo(n-2,memo);
        }

        return memo[n];

    }




}