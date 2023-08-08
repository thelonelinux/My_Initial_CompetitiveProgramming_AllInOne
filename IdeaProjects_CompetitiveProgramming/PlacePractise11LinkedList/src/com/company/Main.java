package com.company;

import java.util.LinkedList;

class  Node{
    int data;
    Node next;
}

class MyLinkedList{

    Node head;

    void insert(int data){
        Node node =new Node();
//        node.next=null;
        node.data=data;

        if (head==null){
            head=node;
        }
        else {
            Node n=head;

            while (n.next!=null){

                n=n.next;
            }
            n.next=node;
        }
    }

    void show(){

        Node node=head;

        while (node.next!=null){
            System.out.println(node.data);
            node=node.next;
        }

        System.out.println(node.data);
    }
    void reverseShow(){

        int size=0;
        Node n=head;

        while(n.next!=null){
            size=size+1;
            n=n.next;
        }
        size=size+1;
        int[] arr=new int[size];
        int c=0;


        Node node=head;
        while(node.next!=null){
            arr[c]=node.data;
            c++;
            node=node.next;
        }
        arr[c++]=node.data;

        for(int i=size-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }

}


public class Main {

    public static void main(String[] args) {
	// write your code here

        MyLinkedList list=new MyLinkedList();

        list.insert(5);
        list.insert(6);
        list.insert(8);

        list.show();
        System.out.println("Reverse show of the linked list is ");
        list.reverseShow();



    }
}
