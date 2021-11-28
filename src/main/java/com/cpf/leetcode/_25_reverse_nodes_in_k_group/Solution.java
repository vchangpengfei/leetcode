package com.cpf.leetcode._25_reverse_nodes_in_k_group;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    static class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

    /**
     * 每次提前遍历 k 个节点，看是否足够
     *
     * 需要虚拟出首节点
     *
     * 每次处理
     *
     * pre  k k+1 个元素
     * @param head
     * @param k
     * @return
     */
    public static ListNode reverseKGroup(ListNode head, int k) {

        ListNode first=new ListNode();

        first.next=head;

        ListNode pre=first;

        ListNode cursor=first;

        int count=0;

        while (true)
        {

            if(count==k)
            {

                ListNode left=pre.next;

                ListNode right=left.next;

                ListNode last=right.next;

                count=count-1;

                while (count>0)
                {
                    pre.next=right;

                    left.next=last;

                    right.next=left;

                    right=last;

                    left=pre.next;

                    count=count-1;
                }

                pre=cursor;
            }

            if(cursor.next!=null)
            {
                cursor=cursor.next;

                count=count+1;
            }else {
                break;
            }
        }

        return first.next;

    }
}