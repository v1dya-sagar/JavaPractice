package com.vsk.practice.DataStructures.Trees.Problems.DFS;

import com.vsk.practice.DataStructures.Trees.Problems.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * created by : v1dya-sagar on 16-07-2024
 *
 * @author : v1dya-sagar
 * @date : 16-07-2024
 * @project : JavaPractice
 */
public class StepByStepDirectionsFromABinaryTreeNodeToAnother {
    List<String> paths;
    public String getDirections(TreeNode root, int startValue, int destValue) {
        if(root == null)
            return "";
        paths = new ArrayList();
        TreeNode lca = lca(root, startValue, destValue);
        find(lca, startValue, new StringBuilder());
        find(lca, destValue, new StringBuilder());
        StringBuilder result = new StringBuilder();

        for(int i = 0 ; i < paths.get(0).length(); i++)
            result.append("U");
        result.append(paths.get(1));
        return result.toString();
    }

    public TreeNode lca(TreeNode node, int startValue, int destValue){

        if(node == null)
            return null;

        if(node.val == startValue || node.val == destValue)
            return node;

        TreeNode left = lca(node.left, startValue, destValue);
        TreeNode right = lca(node.right, startValue, destValue);

        if(left != null && right != null)
            return node;

        return left != null ? left : right;
    }

    public void find(TreeNode node, int val, StringBuilder path){
        if(node == null)
            return;

        if(node.val == val){
            paths.add(path.toString());
            return;
        }

        if(node.left != null)
            find(node.left, val, path.append("L"));
        if(node.right != null)
            find(node.right, val, path.append("R"));

        path.deleteCharAt(path.length()-1);
        return;
    }
}
