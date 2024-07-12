package com.vsk.practice.DataStructures.Trees.Problems.DFS;

import com.vsk.practice.DataStructures.Trees.Problems.TreeNode;

import java.util.Stack;

/**
 * created by : v1dya-sagar on 12-07-2024
 *
 * @author : v1dya-sagar
 * @date : 12-07-2024
 * @project : JavaPractice
 */
public class DFSUsingStack {
    void dfsStack(TreeNode node) {
        if(node == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);

        while(!stack.isEmpty()) {
            TreeNode removed = stack.pop();
            System.out.print(removed.val + " ");
            if(removed.right != null) {
                stack.push(removed.right);
            }
            if(removed.left != null) {
                stack.push(removed.left);
            }
        }
    }

}
