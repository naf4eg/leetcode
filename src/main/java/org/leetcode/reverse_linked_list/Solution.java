package org.leetcode.reverse_linked_list;

class Solution {
    public static void main(String[] args) {
        var solution = new Solution();
        var startList = new ListNode(1, new ListNode(2, new ListNode(3)));
        System.out.println(startList);
        var reverseList = solution.reverseList(startList);
        System.out.println(reverseList);
    }

    public ListNode reverseList(ListNode head) {
        // null->1->2->3->null
        // null<-1<-2<-3<-null

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; // сохраним следующий элемент в head
            curr.next = prev; //перепривяжем ссылку
            prev = curr; //смещаем на 1 вперед
            curr = next; //смещаем на 1 вперед
        }

        return prev;
    }
}
