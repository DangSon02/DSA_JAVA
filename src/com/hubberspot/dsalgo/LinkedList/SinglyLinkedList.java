package com.hubberspot.dsalgo.LinkedList;

public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {

        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void disPlay() {
        ListNode current = head;

        while (current != null) {

            System.out.print(current.data + "--->");
            current = current.next;

        }

        System.out.println("null");
    }

    public int lengthLinkedList() {

        int count = 0;
        ListNode current = head;

        while (current != null) {
            count++;
            current = current.next;

        }

        return count;
    }

    public void insertFirst(int data) {

        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;

    }

    public void insertEnd(int data) {
        ListNode newNode = new ListNode(data);
        ListNode current = head;

        if (head.next == null) {
            head = newNode;
            return;
        }

        while (current.next != null) {
            current = current.next;

        }
        current.next = newNode;

    }

    public void insert(int position, int data) {

        ListNode newNode = new ListNode(data);

        if (position == 1 || head == null) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode previous = head;
            int count = 1;

            while (count < position - 1) {

                previous = previous.next;
                count++;
            }

            ListNode current = previous.next;
            previous.next = newNode;
            newNode.next = current;
        }

    }

    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }

        ListNode temp = head;

        head = head.next;
        temp.next = null;

        return temp;
    }

    public ListNode deleteLast() {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;

        }

        previous.next = null;
        return current;

    }

    public void delete(int position) {

        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {

                previous = previous.next;
                count++;

            }

            ListNode current = previous.next;
            previous.next = current.next;
        }

    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        // sll.head = new ListNode(10);
        // ListNode second = new ListNode(1);
        // ListNode third = new ListNode(8);
        // ListNode fourth = new ListNode(11);

        // sll.head.next = second; // 10--->1
        // second.next = third; // 10--->1--->8
        // third.next = fourth; // 10--->1--->8--->11

        // sll.insertFirst(1);
        // sll.insertFirst(8);
        // sll.insertFirst(11);
        // sll.insertEnd(12);
        sll.insert(2, 15);
        sll.insert(1, 14);
        sll.insert(3, 11);
        sll.insert(3, 17);
        // sll.deleteFirst();
        // sll.deleteLast();
        sll.delete(1);

        sll.disPlay();
        System.out.println("Length Linked List:: " + sll.lengthLinkedList());

    }

}
