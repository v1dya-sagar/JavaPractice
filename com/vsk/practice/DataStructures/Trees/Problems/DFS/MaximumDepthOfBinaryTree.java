package com.vsk.practice.DataStructures.Trees.Problems.DFS;

import com.vsk.practice.DataStructures.Trees.Problems.TreeNode;

/**
 * created by : v1dya-sagar on 10-07-2024
 *
 * @author : v1dya-sagar
 * @date : 10-07-2024
 * @project : JavaPractice
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        int depth = Math.max(leftHeight, rightHeight)+1;

        return depth;
    }
}
