package com.example.interview.inter;

import java.util.*;
import java.util.stream.Stream;

class Solution {
    private void p(ListNode head) {
        ListNode c=head;
        while(c!=null){
            System.out.println();
            c=c.next;
        }
    }

     private class TreeNode {
     int val;
     TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }}
    private class ListNode {
     int val;
     ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}