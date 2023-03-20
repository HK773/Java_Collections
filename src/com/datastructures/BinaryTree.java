package com.datastructures;

public class BinaryTree
{
    static Node root;
    
    static {
        BinaryTree.root = null;
    }
    
    public void addNode( int data) {
        System.out.println("Adding node");
         Node newNode = new Node(data);
        Node focusNode = null;
        if (BinaryTree.root == null) {
            BinaryTree.root = newNode;
            System.out.println("root: " + BinaryTree.root);
            return;
        }
        focusNode = BinaryTree.root;
        while (true) {
             Node parent = focusNode;
            if (data < focusNode.data) {
                focusNode = focusNode.left;
                if (focusNode == null) {
                    parent.left = newNode;
                    return;
                }
                continue;
            }
            else {
                focusNode = focusNode.right;
                if (focusNode == null) {
                    parent.right = newNode;
                    return;
                }
                continue;
            }
        }
    }
    
    public void preOrderTraversal( Node focusNode) {
        if (focusNode == null) {
            System.out.println("Tree is empty");
        }
        else {
            System.out.println(String.valueOf(focusNode.data) + " ");
            this.preOrderTraversal(focusNode.left);
            this.preOrderTraversal(focusNode.right);
        }
    }
    
    public void inOrderTraversal( Node root) {
        if (root == null) {
            System.out.println("Tree is Empty");
            return;
        }
        this.inOrderTraversal(root.left);
        System.out.println(root.data);
        this.inOrderTraversal(root.right);
    }
    
    public void postOrderTraversal( Node root) {
        if (root == null) {
            System.out.println("Tree is Empty");
            return;
        }
        this.postOrderTraversal(root.left);
        this.postOrderTraversal(root.right);
        System.out.println(" " + root.data + " ");
    }
}