package com.bptn.leetcode.challenge_5;

class ListNode {
    int val;
    ListNode next;

    // Constructor without parameters
    ListNode() {}

    // Constructor with value
    ListNode(int val) {
        this.val = val;
    }

    // Constructor with value and next node
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to simplify the merge process
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy; // This pointer will track the end of the merged list

        // Merge the two lists
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1; // Link the smaller node
                list1 = list1.next; // Move the pointer in list1
            } else {
                tail.next = list2; // Link the smaller node
                list2 = list2.next; // Move the pointer in list2
            }
            tail = tail.next; // Move the tail pointer forward
        }

        // If there are remaining nodes in either list, attach them
        if (list1 != null) {
            tail.next = list1;
        } else if (list2 != null) {
            tail.next = list2;
        }

        // The merged list starts from the next of the dummy node
        return dummy.next;
    }

    // Example usage
    public static void main(String[] args) {
        // Create example lists
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        MergeLists solution = new MergeLists();
        ListNode mergedHead = solution.mergeTwoLists(list1, list2);

        // Print merged list
        ListNode current = mergedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}