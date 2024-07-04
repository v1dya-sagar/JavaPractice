package com.vsk.practice.DataStructures.LinkedLists.Problems;

public class MergeNodesInBetweenZeroes {
    public static void main(String[] args) {
        ListNode LL = new ListNode(0);
        LL.next = new ListNode(3);
        LL.next.next = new ListNode(1);
        LL.next.next.next = new ListNode(0);
        LL.next.next.next.next = new ListNode(4);
        LL.next.next.next.next.next = new ListNode(5);
        LL.next.next.next.next.next.next = new ListNode(2);
        LL.next.next.next.next.next.next.next = new ListNode(0);


        ListNode mergedList = mergeNodes(LL);

        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
    public static ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE), prev = dummy;
        while (head != null && head.next != null) {
            prev.next = head; // prev connects next 0 node.
            head = head.next; // head forward to a non-zero node.
            while (head != null && head.val != 0) { // traverse all non-zero nodes between two zero nodes.
                prev.next.val += head.val; // add current value to the previous zero node.
                head = head.next; // forward one step.
            }
            prev = prev.next; // prev point to the summation node (initially 0).
        }
        prev.next = null; // cut off last 0 node.
        return dummy.next;
    }
}

