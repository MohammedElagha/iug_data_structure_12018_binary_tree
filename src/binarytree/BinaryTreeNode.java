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
public class BinaryTreeNode<E> {
    private BinaryTreeNode<E> parent = null;
    private BinaryTreeNode<E> left = null;
    private BinaryTreeNode<E> right = null;
    private E data = null;
    
    public BinaryTreeNode(E data) {
        this.data = data;
    }
    
    public BinaryTreeNode<E> getParent() {
        return parent;
    }
    
    public void setParent(BinaryTreeNode<E> parent) {
        this.parent = parent;
    }

    public BinaryTreeNode<E> getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode<E> left) {
        this.left = left;
    }

    public BinaryTreeNode<E> getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode<E> right) {
        this.right = right;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
    
    public void addLeft(BinaryTreeNode<E> left) {
        left.setParent(this);
        this.setLeft(left);
    }
    
    public void addRight(BinaryTreeNode<E> right) {
        right.setParent(this);
        this.setRight(right);
    }
    
    public void addParentToLeft(BinaryTreeNode<E> parent) {
        this.setParent(parent);
        parent.setLeft(this);
    }
    
    public void addParentToRight(BinaryTreeNode<E> parent) {
        this.setParent(parent);
        parent.setRight(this);
    }
}
