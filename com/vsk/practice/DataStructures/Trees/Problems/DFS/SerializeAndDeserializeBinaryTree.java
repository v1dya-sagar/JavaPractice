package com.vsk.practice.DataStructures.Trees.Problems.DFS;

import com.vsk.practice.DataStructures.Trees.Problems.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * created by : v1dya-sagar on 11-07-2024
 *
 * @author : v1dya-sagar
 * @date : 11-07-2024
 * @project : JavaPractice
 */
public class SerializeAndDeserializeBinaryTree {
    public String serialize(TreeNode node) {
        List<String> list = new ArrayList<>();
        helper(node, list);
        return String.join(",", list);
    }

    private void helper(TreeNode node, List<String> list) {
        if (node == null) {
            list.add("null");
            return;
        }

        list.add(String.valueOf(node.val));

        helper(node.left, list);
        helper(node.right, list);
    }

    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        List<String> list = new ArrayList<>();
        Collections.addAll(list, arr);
        Collections.reverse(list);
        return helper2(list);
    }

    private TreeNode helper2(List<String> list) {
        String val = list.remove(list.size() - 1);

        if (val.equals("null")) {
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(val));

        node.left = helper2(list);
        node.right = helper2(list);

        return node;
    }
}
