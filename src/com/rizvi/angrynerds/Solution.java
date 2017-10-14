package com.rizvi.angrynerds;
class Solution {
 
    static ListNode head;
    static class ListNode {
 
        int data;
        ListNode next;
 
        ListNode(int d) {
            data = d;
            next = null;
        }
    }
 
    // prints content of double linked list
    void printALinkedList(ListNode node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    public static void main(String[] args) {
        Solution list = new Solution();
        list.head = new ListNode(85);
        list.head.next = new ListNode(15);
        list.head.next.next = new ListNode(4);
        list.head.next.next.next = new ListNode(20);
         
        System.out.println("Given Linked list");
        list.printALinkedList(head);
    }
}