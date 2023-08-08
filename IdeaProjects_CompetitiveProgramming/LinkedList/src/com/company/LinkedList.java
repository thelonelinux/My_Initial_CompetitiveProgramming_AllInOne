package com.company;

public class LinkedList {

    Node head;  // head of list

    /* Linked list Node.  This inner class is made static so that
       main() can access it */
    static class Node {
        int data;
        Node next;

        Node(int d)  {
            data = d;
            next=null;
        } // Constructor
    }

    /* This function prints contents of linked list starting from head */
    public void printList()
    {
        Node n = head;
        while (n != null)
        {
            System.out.print(n.data+"->");
            n = n.next;
        }
        System.out.println("Null");
    }

    /* method to create a simple linked list with 3 nodes*/
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        list.head       = new Node(1);
        Node second      = new Node(2);
        Node third       = new Node(3);

        list.head.next = second; // Link first node with the second node
        second.next = third; // Link first node with the second node

        list.printList();
    }
}
