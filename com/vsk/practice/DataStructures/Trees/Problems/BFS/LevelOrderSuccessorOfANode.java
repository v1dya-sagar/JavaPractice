package com.vsk.practice.DataStructures.Trees.Problems.BFS;

import com.vsk.practice.DataStructures.Trees.Problems.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderSuccessorOfANode {
    public static TreeNode findSuccessor(TreeNode root, int value){
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
            if (currentNode.val == value) {
                break;
            }
        }
        return queue.peek();
    }
}
