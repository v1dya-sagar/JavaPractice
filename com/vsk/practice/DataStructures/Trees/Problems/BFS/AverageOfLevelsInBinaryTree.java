package com.vsk.practice.DataStructures.Trees.Problems.BFS;

import com.vsk.practice.DataStructures.Trees.Problems.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            double value = 0;
            for(int i = 0; i < levelSize; i++){
                TreeNode node = queue.poll();
                value += node.val;
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            value /= levelSize;
            result.add(value);
        }
        return result;
    }
}
