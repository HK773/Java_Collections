package com.datastructures;

public class BinaryTreeDemo extends BinaryTree
{
    public static void main( String[] args) {
         BinaryTreeDemo tree = new BinaryTreeDemo();
        tree.addNode(50);
        tree.addNode(25);
        tree.addNode(75);
        tree.addNode(12);
        tree.addNode(37);
        tree.addNode(43);
        tree.addNode(30);
        System.out.println("Pre-order traversal");
        tree.preOrderTraversal(BinaryTreeDemo.root);
        System.out.println(" ");
        System.out.println("Inorder Traversal");
        tree.inOrderTraversal(BinaryTreeDemo.root);
        System.out.println(" ");
        System.out.println("Postorder Traversal");
        tree.postOrderTraversal(BinaryTreeDemo.root);
    }
}