package com.vsk.practice.DataStructures.Trees.BinarySearchTree;

public class Main {
    public static void main(String[] args) {


        BinarySearchTree binarySearchTree = new BinarySearchTree();
        int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
        binarySearchTree.populate(nums);
        binarySearchTree.display();
    }
}