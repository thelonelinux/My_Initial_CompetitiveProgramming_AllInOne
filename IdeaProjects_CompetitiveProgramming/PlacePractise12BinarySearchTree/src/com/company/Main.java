package com.company;


class Node{
    int data;
    Node left;
    Node right;
}

class BST{

    public Node createNewNode(int k){
        Node node =new Node();
        node.data=k;
        node.left=null;
        node.right=null;
        return node;
    }


    public Node insert(Node node, int val){

        if(node==null){
            return createNewNode(val);
        }
        else if(val>node.data){
            node.right=insert(node.right,val);
        }
        else if (val<node.data){
            node.left=insert(node.left,val);
        }
        return node;
    }

    public Node delete(Node node , int val){

        if (node==null){
            return null;
        }
        else if (val<node.data){
            node.left=delete(node.left,val);
        }
        else if (val>node.data){
            node.right=delete(node.right,val);

        }


        else{  //we found the data now
            if(node.left==null || node.right==null){
                Node temp=null;
                temp=node.left==null? node.right : node.left;

                if (temp==null){
                    return null;
                }
                else {
                    return temp;
                }
            }
            else {
                Node successor=getSuccessor(node);
                node.data=successor.data;
                node.right=delete(node.right,node.data);
                return node;
            }


        }

        return node;

    }


    public Node getSuccessor(Node node){
        if (node==null){
            return null;

        }
        Node temp=node.right;
        while (temp.left!=null){
            temp=temp.left;

        }
        return temp;
    }

    public static void preOrder(Node node){

        if (node==null){
            return;
        }

        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);

    }

}

public class Main {

    public static void main(String[] args) {


        BST a = new BST();

        Node root=null;

        root=a.insert(root,8);
        root=a.insert(root,3);
        root=a.insert(root,6);
        root=a.insert(root,10);
        root=a.insert(root,4);
        root=a.insert(root,7);
        root=a.insert(root,1);
        root=a.insert(root,14);
        root=a.insert(root,13);
        root=a.delete(root,6);

        a.preOrder(root);


    }
}
