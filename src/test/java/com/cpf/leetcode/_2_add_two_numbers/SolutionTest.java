package com.cpf.leetcode._2_add_two_numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void addTwoNumbers() {


        int a[]=new int[]{9,9,9,9,9,9,9};

        ListNode al=getNode(a);

        int b[]=new int[]{9,9,9,9};

        ListNode bl=getNode(b);

        ListNode listNode=Solution.addTwoNumbers(al,bl);

        while (listNode!=null)
        {
            System.out.println(listNode.val);

            listNode=listNode.next;
        }
    }

    private ListNode getNode(int[] a) {
        ListNode al=null;

        ListNode rl=null;
        for(int i:a)
        {
            if(al==null)
            {
                rl=al=new ListNode(i);
            }else
            {
                al.next=new ListNode(i);

                al=al.next;
            }
        }
        return rl;
    }
}