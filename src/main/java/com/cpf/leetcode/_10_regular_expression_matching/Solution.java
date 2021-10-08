package com.cpf.leetcode._10_regular_expression_matching;


/**
 * 给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。
 *
 * '.' 匹配任意单个字符
 * '*' 匹配零个或多个前面的那一个元素
 * 所谓匹配，是要涵盖 整个 字符串 s的，而不是部分字符串。
 *
 *  
 * 示例 1：
 *
 * 输入：s = "aa" p = "a"
 * 输出：false
 * 解释："a" 无法匹配 "aa" 整个字符串。
 * 示例 2:
 *
 * 输入：s = "aa" p = "a*"
 * 输出：true
 * 解释：因为 '*' 代表可以匹配零个或多个前面的那一个元素, 在这里前面的元素就是 'a'。因此，字符串 "aa" 可被视为 'a' 重复了一次。
 * 示例 3：
 *
 * 输入：s = "ab" p = ".*"
 * 输出：true
 * 解释：".*" 表示可匹配零个或多个（'*'）任意字符（'.'）。
 * 示例 4：
 *
 * 输入：s = "aab" p = "c*a*b"
 * 输出：true
 * 解释：因为 '*' 表示零个或多个，这里 'c' 为 0 个, 'a' 被重复一次。因此可以匹配字符串 "aab"。
 * 示例 5：
 *
 * 输入：s = "mississippi" p = "mis*is*p*."
 * 输出：false
 *  
 *
 * 提示：
 *
 * 0 <= s.length <= 20
 * 0 <= p.length <= 30
 * s 可能为空，且只包含从 a-z 的小写字母。
 * p 可能为空，且只包含从 a-z 的小写字母，以及字符 . 和 *。
 * 保证每次出现字符 * 时，前面都匹配到有效的字符
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/regular-expression-matching
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

class Solution {
    /**
     * aaaa a*a 的问题没法解决
     * @param s
     * @param p
     * @return
     */
    public static boolean isMatch(String s, String p) {

        char sarr[]=s.toCharArray();

        char parr[]=p.toCharArray();

        int sindex=0,pindex=0,xing=0;

        boolean lastCheck=true;



        while(pindex<parr.length)
        {

//            if(sindex==sarr.length)
//            {
//                pindex=pindex+1;
//
//                if(parr[pindex]==sarr[sarr.length-1])
//                {
//                    continue;
//                }else {
//
//                }
//            }


            if(parr[pindex]=='*')
            {

                if(parr[pindex-1]==sarr[sindex]||parr[pindex-1]=='.')
                {
                    xing=sindex;

                    sindex=sindex+1;
                }else {
                    pindex=pindex+1;

                    lastCheck=true;
                }

                continue;
            }


            if(sarr[sindex]==parr[pindex]||parr[pindex]=='.')
            {
                sindex=sindex+1;

                pindex=pindex+1;

                continue;
            }else {

                if(!lastCheck)
                {
                    return false;
                }

                lastCheck=false;

                pindex=pindex+1;

                continue;
            }



        }

        if(sindex==sarr.length)
        {
            if((pindex==parr.length-1&&parr[pindex]=='*')||pindex==parr.length)
            {
                return true;
            }

            return false;
        }else {
            return false;
        }

    }




    public static boolean isMatch1(String s, String p) {
        if (p==null){
            if (s==null){
                return true;
            }else{
                return false;
            }
        }

        if (s==null && p.length()==1){
            return false;
        }

        int m = s.length()+1;
        int n = p.length()+1;

        boolean[][]dp = new boolean[m][n];

        dp[0][0] = true;

        for (int j=2;j<n;j++){
            if (p.charAt(j-1)=='*'){
                dp[0][j] = dp[0][j-2];
            }
        }

        for (int r=1;r<m;r++){
            int i = r-1;
            for (int c=1;c<n;c++){
                int j = c-1;
                if (s.charAt(i)==p.charAt(j) || p.charAt(j)=='.'){
                    dp[r][c] = dp[r-1][c-1];
                }else if (p.charAt(j)=='*'){
                    if (p.charAt(j-1)==s.charAt(i) || p.charAt(j-1)=='.'){
                        dp[r][c] = dp[r-1][c] || dp[r][c-2];
                    }else{
                        dp[r][c] = dp[r][c-2];
                    }
                }else{
                    dp[r][c] = false;
                }

            }
        }

        System.out.println("匹配字符："+s+"  正则："+p);

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("  "+dp[i][j]);
            }
            System.out.println();
        }


        return dp[m-1][n-1];
    }


}