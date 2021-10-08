package com.cpf.leetcode._1137_n_th_tribonacci_number;

/**
 * 泰波那契序列 Tn 定义如下： 
 *
 * T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
 *
 * 给你整数 n，请返回第 n 个泰波那契数 Tn 的值。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：n = 4
 * 输出：4
 * 解释：
 * T_3 = 0 + 1 + 1 = 2
 * T_4 = 1 + 1 + 2 = 4
 * 示例 2：
 *
 * 输入：n = 25
 * 输出：1389537
 *  
 *
 * 提示：
 *
 * 0 <= n <= 37
 * 答案保证是一个 32 位整数，即 answer <= 2^31 - 1。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/n-th-tribonacci-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution {
    /**
     * 递归的方法 输入35 的时候超出时间限制 要2s  递归效果不高
     * @param n
     * @return
     */
    public static int tribonacci(int n) {

        if(n==0)
        {
            return 0;
        }

        if(n==1)
        {
            return 1;
        }

        if(n==2)
        {
            return 1;
        }

        int result=tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);

        return result;
    }


    public static int tribonacci1(int n) {

        if(n==0)
        {
            return 0;
        }

        if(n==1||n==2)
        {
            return 1;
        }

        int a=0,b=1,c=1;

        for(int i=3;i<=n;i++)
        {
            int d=a+b+c;

            a=b;

            b=c;

            c=d;
        }
        return c;
    }
    public static int tribonacci2(int n) {
        if(n <= 1)
            return n;

        if(n == 2)
            return 1;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for(int i = 3; i <= n; i++)
        {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        return dp[n];
    }


    public static int tribonacci3(int n) {
        int memo[]=new int[n+1];
        return tribonacciMemo(n,memo);
    }

    public static int tribonacciMemo(int n, int[] memo) {

        if(memo[n]>0)
        {
            return memo[n];
        }
        if(n==0)
        {
            memo[1]= 0;
        }else if(n==1)
        {
            memo[1]= 1;
        }else if(n==2){
            memo[2]= 1;
        }else {
            memo[n]=tribonacciMemo(n-1,memo)+tribonacciMemo(n-2,memo)+tribonacciMemo(n-3,memo);
        }

        return memo[n];

    }




}