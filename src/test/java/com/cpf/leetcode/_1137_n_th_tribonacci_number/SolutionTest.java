package com.cpf.leetcode._1137_n_th_tribonacci_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void tribonacci() {
//        System.out.println(Solution.tribonacci(40));
//        System.out.println(Solution.tribonacci1(100));
//        System.out.println(Solution.tribonacci2(35));
//        System.out.println(Solution.tribonacci3(1000));

        for(int i=0;i<10000;i++)
        {
            Solution.tribonacci3(1000);
        }

    }
}