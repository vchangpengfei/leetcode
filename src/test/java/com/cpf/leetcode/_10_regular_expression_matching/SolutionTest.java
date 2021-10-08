package com.cpf.leetcode._10_regular_expression_matching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * 用动态规划的方法 如果第一个字符匹配错误，不能直接退出，每次都要计算到最后才知道结果 性能不好
 *
 * 状态转移 比较难理解
 *
 * 状态转义矩阵 是否可以复用  建立一个巨大的矩阵  做缓存查询
 *
 * 回溯算法实现 TODO
 *
 *
 * 状态机算法实现 TODO
 *
 *
 *
 *
 */
class SolutionTest {

    @Test
    void isMatch() {

//        System.out.println(Solution.isMatch("aa","c*"));
//        System.out.println(Solution.isMatch("aa","a"));
//        System.out.println(Solution.isMatch("aa","a*"));
//        System.out.println(Solution.isMatch("aaa","aaaa"));
//        System.out.println(Solution.isMatch("ab",".*"));
//        System.out.println(Solution.isMatch("aab","c*a*b"));
//        System.out.println(Solution.isMatch("ab",".*c"));
        System.out.println(Solution.isMatch("aaa","a*aaa"));
        System.out.println(Solution.isMatch("b","c*a*b"));
        System.out.println(Solution.isMatch("mississippi","mis*is*p*."));
    }
}