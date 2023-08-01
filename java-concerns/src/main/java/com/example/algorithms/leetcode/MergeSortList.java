package com.example.algorithms.leetcode;

public class MergeSortList {

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(5)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode mergedList = mergeTwoLists(list1, list2);

        // Print merged list
        while (mergedList != null) {
            System.out.print(mergedList.val);
            if (mergedList.next != null) {
                System.out.print(",");
            }
            mergedList = mergedList.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if (list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
