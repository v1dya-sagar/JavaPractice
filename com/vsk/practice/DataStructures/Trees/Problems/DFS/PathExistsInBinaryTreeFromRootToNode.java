package com.vsk.practice.DataStructures.Trees.Problems.DFS;

import com.vsk.practice.DataStructures.Trees.Problems.TreeNode;

/**
 * created by : v1dya-sagar on 11-07-2024
 *
 * @author : v1dya-sagar
 * @date : 11-07-2024
 * @project : JavaPractice
 */
public class PathExistsInBinaryTreeFromRootToNode {
    boolean findPath(TreeNode node, int[] arr) {
        if (node == null) {
            return arr.length == 0;
        }
        return helper(node, arr, 0);
    }
    boolean helper(TreeNode node, int[] arr, int index) {
        if(node == null) {
            return false;
        }
        if(index >= arr.length || node.val != arr[index]) {
            return false;
        }
        if(node.left == null && node.right == null && index == arr.length - 1) {
            return true;
        }
        return helper(node.left, arr, index + 1) || helper(node.right, arr, index + 1);
    }
}
