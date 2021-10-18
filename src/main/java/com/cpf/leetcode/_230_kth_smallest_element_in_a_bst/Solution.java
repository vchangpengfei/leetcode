package com.cpf.leetcode._230_kth_smallest_element_in_a_bst;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */



class Solution {

     static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public static int kthSmallest(TreeNode root, int k) {

        Deque<TreeNode> queue=new ArrayDeque<TreeNode>();

        while (root!=null||!queue.isEmpty())
        {
            while (root!=null)
            {
                queue.push(root);

                root=root.left;
            }

            root=queue.pop();

            k=k-1;

            if(k==0)
            {
                break;
            }

            root=root.right;

        }


        return root.val;
    }
}