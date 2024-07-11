package com.vsk.practice.DataStructures.Trees.Problems.DFS;

import com.vsk.practice.DataStructures.Trees.Problems.TreeNode;

/**
 * created by : v1dya-sagar on 11-07-2024
 *
 * @author : v1dya-sagar
 * @date : 11-07-2024
 * @project : JavaPractice
 */
public class KthSmallestElementInABST {
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        return helper(root, k).val;
    }
    public TreeNode helper(TreeNode root, int k) {
        if (root == null) {
            return null;
        }

        TreeNode left = helper(root.left, k);

        if (left != null) {
            return left;
        }

        count++;

        if(count == k) {
            return root;
        }

        return helper(root.right, k);
    }
}
/*
public int kthSmallest(TreeNode root, int k) {
        if(root == null){
            return -1;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, k, arr);
        return arr.get(k - 1);
    }
    void inorder(TreeNode root, int k, ArrayList<Integer> arr){

        if(arr.size() == k || root == null){
            return;
        }

        inorder(root.left, k, arr);
        arr.add(root.val);
        inorder(root.right, k, arr);

    */