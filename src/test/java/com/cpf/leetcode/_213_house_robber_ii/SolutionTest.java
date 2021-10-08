package com.cpf.leetcode._213_house_robber_ii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void rob() {
        System.out.println(Solution.rob(new int[]{2,2,4,3,}));
        System.out.println(Solution.rob(new int[]{2,2,4,3,2,5}));
        System.out.println(Solution.rob(new int[]{200,3,140,20,10}));
        System.out.println(Solution.rob(new int[]{2,3,2}));
    }
}