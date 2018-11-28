/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author Mohammed El-Agha
 */
public class Main {
    public static void main(String[] args) {
        BinaryTreeNode<String> root = new BinaryTreeNode("Root");
        
        BinaryTreeNode<String> left = new BinaryTreeNode("Left");
        BinaryTreeNode<String> right = new BinaryTreeNode("Right");
        
        root.addLeft(left);
        right.addParentToRight(root);
        
        System.out.println(root.getLeft().getData().toString());
        System.out.println(root.getRight().getData().toString());
    }
}
