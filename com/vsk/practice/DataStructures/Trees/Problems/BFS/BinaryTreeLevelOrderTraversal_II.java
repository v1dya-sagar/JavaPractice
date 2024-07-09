package com.vsk.practice.DataStructures.Trees.Problems.BFS;

import com.vsk.practice.DataStructures.Trees.Problems.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * created by : v1dya-sagar on 09-07-2024
 *
 * @author : v1dya-sagar
 * @date : 09-07-2024
 * @project : JavaPractice
 */
public class BinaryTreeLevelOrderTraversal_II {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            // number of nodes represent level size at that level
            // initially 1 because of root
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();
            // iterate number of times as the number of nodes in that level
            for(int i = 0; i < levelSize; i++){
                // removes the node once its value gets included in the level list (represents values from that level)
                TreeNode node = queue.poll();
                level.add(node.val);

                // include the nodes from next level
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            // add the list containing all the node values from that level
            result.add(0, level);
        }
        return result;
    }
}
