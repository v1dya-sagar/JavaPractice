package com.vsk.practice.DataStructures.Trees.Problems.DFS;

import com.vsk.practice.DataStructures.Trees.Problems.TreeNode;

/**
 * created by : v1dya-sagar on 10-07-2024
 *
 * @author : v1dya-sagar
 * @date : 10-07-2024
 * @project : JavaPractice
 */
public class FlattenBinaryTreeToLinkedList {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    public void flatten(TreeNode root) {
        TreeNode current = root;
        while (current != null) {
            if (current.left != null) {
                TreeNode temp = current.left;
                while(temp.right != null) {
                    temp = temp.right;
                }

                temp.right = current.right;
                current.right = current.left;
                current.left= null;
            }
            current = current.right;
        }

    }
    // Queue<TreeNode> queue = new LinkedList<>();
    // public void flatten(TreeNode root) {
    //     if(root == null){
    //         return;
    //     }
    //     preOrder(root);
    //     TreeNode currentNode;
    //     currentNode = queue.poll();
    //     while(!queue.isEmpty()){
    //         currentNode.left = null;
    //         currentNode.right = queue.poll();
    //         currentNode = currentNode.right;
    //     }
    // }
    // void preOrder(TreeNode node) {
    //     if (node == null) {
    //         return;
    //     }
    //     queue.offer(node);
    //     preOrder(node.left);
    //     preOrder(node.right);
    // }
}
