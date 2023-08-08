package com.company;

public class Main {

    class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}


    public static BinaryTreeNode<Integer> removeAllLeaves(BinaryTreeNode<Integer> root){

        // Write your code he

        if (root.data==-1){
            return root;
        }
        else {
            if (root.left.data==-1 && root.right.data==-1 && root.data!=-1){
                root.data=-1;
            }
            if (root.left.data!=-1){
                return removeAllLeaves(root.left);
            }
            else if (root.right.data!=-1){
                return removeAllLeaves(root.right);
            }
        }
        return root;

    }



    public static void main(String[] args) {

    }
}
