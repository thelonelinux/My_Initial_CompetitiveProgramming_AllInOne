package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {

    private class Node{

        int data;
        ArrayList<Node> children;

        Node(int data){
            this.data=data;
            children=new ArrayList<>();
        }

    }


    Node root;
    int size=0;

    GenericTree(){
        Scanner s=new Scanner(System.in);
        this.root=takeInput(s,null,0);
    }

    private Node takeInput(Scanner s,Node parent,int ithchild){
        if(parent==null){
            System.out.println("Enter the data for  ");
        }
        else {

            System.out.println("Enter data for"+ithchild+"ithchild of "+parent.data);
        }

        int nodeData=s.nextInt();
        Node node=new Node(nodeData);
        this.size++;
        System.out.println("Enter number of children for"+node.data);
        int numChild=s.nextInt();

        for (int i=0;i<numChild;i++){
            Node child=this.takeInput(s,node,i);
            node.children.add(child);
        }

        return node;

    }

    public void display(){
        this.display(this.root);

    }

    private void display(Node node){
        System.out.print(node.data+"=>");
        for (int i=0;i<node.children.size();i++){
            System.out.println(node.children.get(i).data+",");
        }
        System.out.print("End");

        for (int i=0;i<node.children.size();i++){
            this.display(node.children.get(i));
        }

    }
}
