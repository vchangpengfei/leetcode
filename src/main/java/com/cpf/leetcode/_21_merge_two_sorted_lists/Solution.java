package com.cpf.leetcode._21_merge_two_sorted_lists;



 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result=null;

        ListNode cursor=null;

        while(l1!=null||l2!=null)
        {

            if(result==null)
            {
                if(l1==null&&l2!=null)
                {
                    result=new ListNode(l2.val);
                    cursor=result;
                    l2=l2.next;
                }else if(l1!=null&&l2==null)
                {
                    result=new ListNode(l1.val);
                    cursor=result;
                    l1=l1.next;
                }else{

                    if(l1.val>l2.val)
                    {
                        result=new ListNode(l2.val);
                        cursor=result;
                        l2=l2.next;
                    }else if(l1.val<l2.val)
                    {
                        result=new ListNode(l1.val);
                        cursor=result;
                        l1=l1.next;
                    }else {
                        result=new ListNode(l1.val,new ListNode(l2.val));
                        cursor=result.next;
                        l1=l1.next;
                        l2=l2.next;
                    }
                }

            }else {

                if(l1==null&&l2!=null)
                {
                    cursor.next=new ListNode(l2.val);
                    cursor=cursor.next;
                    l2=l2.next;
                }else if(l1!=null&&l2==null)
                {
                    cursor.next=new ListNode(l1.val);
                    cursor=cursor.next;
                    l1=l1.next;
                }else{

                    if(l1.val>l2.val)
                    {
                        cursor.next=new ListNode(l2.val);
                        cursor=cursor.next;
                        l2=l2.next;
                    }else if (l1.val<l2.val)
                    {
                        cursor.next=new ListNode(l1.val);
                        cursor=cursor.next;
                        l1=l1.next;
                    }else{
                        cursor.next=new ListNode(l1.val,new ListNode(l2.val));
                        cursor=cursor.next.next;
                        l1=l1.next;
                        l2=l2.next;
                    }



                }


            }
        }

        return result;
    }
}