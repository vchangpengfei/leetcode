package com.cpf.leetcode._746_min_cost_climbing_stairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void minCostClimbingStairs() {
        System.out.println(Solution.minCostClimbingStairs(new int[]{10, 15, 20}));
        System.out.println(Solution.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}