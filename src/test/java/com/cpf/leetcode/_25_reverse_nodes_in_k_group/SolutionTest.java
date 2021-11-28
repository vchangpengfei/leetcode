package com.cpf.leetcode._25_reverse_nodes_in_k_group;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseKGroup() {

        Solution.ListNode listNode=new Solution.ListNode(1,new Solution.ListNode(2,
                new Solution.ListNode(3,new Solution.ListNode(4,new Solution.ListNode(5)))));

        Solution.reverseKGroup(listNode,2);

    }
}