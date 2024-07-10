package com.vsk.practice.DataStructures.Trees.Problems;

/**
 * created by : v1dya-sagar on 10-07-2024
 *
 * @author : v1dya-sagar
 * @date : 10-07-2024
 * @project : JavaPractice
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

