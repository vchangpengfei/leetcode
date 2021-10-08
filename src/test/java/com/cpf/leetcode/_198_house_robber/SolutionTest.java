package com.cpf.leetcode._198_house_robber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void rob() {
        System.out.println(Solution.rob(new int[]{6,3,10,8,2,10,3,5,10,5,3}));
        System.out.println(Solution.rob(new int[]{1,3,1,3,100}));
        System.out.println(Solution.rob(new int[]{2,7,9,3,1}));
        System.out.println(Solution.rob(new int[]{0}));
    }
}