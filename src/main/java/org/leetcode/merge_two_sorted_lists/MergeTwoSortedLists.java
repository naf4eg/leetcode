package org.leetcode.merge_two_sorted_lists;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        var listNode1 = new ListNode(1, new ListNode(6, new ListNode(9)));
        var listNode2 = new ListNode(5, new ListNode(6, new ListNode(7)));

        var mergeTwoSortedLists = new MergeTwoSortedLists();
        var listNode = mergeTwoSortedLists.mergeTwoLists(listNode1, listNode2);
        System.out.println(listNode);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        var listNode = new ListNode();
        var result = listNode;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                listNode.next = list1;
                list1 = list1.next;
            } else {
                listNode.next = list2;
                list2 = list2.next;
            }
            listNode = listNode.next;
        }

        listNode.next = list1==null ? list2 : list1;
        return result.next;
    }
}

