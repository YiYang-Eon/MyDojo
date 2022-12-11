package com.echo.mashibing.suanfa._002linklist;

import java.util.Arrays;

public class reverseLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        Node res = reverseLinkedList1(head);
        Node res2 = reverseLinkedList2(head);
        System.out.println(res);
        System.out.println(res2);
    }

    public static Node reverseLinkedList1(Node head) {
        Node next = null;
        Node prev = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static Node reverseLinkedList2(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node current = reverseLinkedList2(head.next);
        head.next.next = head;
        head.next = null;
        return current;
    }


    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
