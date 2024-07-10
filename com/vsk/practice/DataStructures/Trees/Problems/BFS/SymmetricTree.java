package com.vsk.practice.DataStructures.Trees.Problems.BFS;

import com.vsk.practice.DataStructures.Trees.Problems.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * created by : v1dya-sagar on 10-07-2024
 *
 * @author : v1dya-sagar
 * @date : 10-07-2024
 * @project : JavaPractice
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);

        while(!queue.isEmpty()){
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            if(left == null && right == null)
                continue;
            if(left == null || right == null){
                return false;
            }
            if(left.val != right.val){
                return false;
            }

            // to compare the mirror equivalent of nodes
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }
}
