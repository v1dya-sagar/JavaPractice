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
public class CousinsInBinaryTree {
    public boolean isCousins(TreeNode root, int x, int y)
    {
        int nodeFound=0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty())
        {
            nodeFound=0;
            int count=queue.size();
            for (int i = 0; i < count; i++)
            {

                TreeNode currentNode=queue.poll();
                if ((currentNode.left!=null && currentNode.right!=null)
                        &&
                        (currentNode.left.val==x && currentNode.right.val==y
                                || currentNode.left.val==y && currentNode.right.val==x))
                    return false;
                if (currentNode.val == x || currentNode.val == y)
                    nodeFound += 1;
                if (currentNode.left!=null)
                    queue.offer(currentNode.left);
                if (currentNode.right!=null)
                    queue.offer(currentNode.right);
            }
            if (nodeFound==2){
                return true;
            }

        }
        return false;
    }
}
/*
public boolean isCousins(TreeNode root, int x, int y) {
    TreeNode xx = findNode(root, x);
    TreeNode yy = findNode(root, y);

    return (
      (level(root, xx, 0) == level(root, yy, 0)) && (!isSibling(root, xx, yy))
    );
  }

  TreeNode findNode(TreeNode node, int x) {
    if (node == null) {
      return null;
    }
    if (node.val == x) {
      return node;
    }
    TreeNode n = findNode(node.left, x);
    if (n != null) {
      return n;
    }
    return findNode(node.right, x);
  }

  boolean isSibling (TreeNode node, TreeNode x, TreeNode y) {
    if (node == null) {
      return false;
    }

    return (
      (node.left == x && node.right == y) || (node.left == y && node.right == x)
      || isSibling(node.left, x, y) || isSibling(node.right, x, y)
    );
  }

  int level (TreeNode node, TreeNode x, int lev) {
    if(node == null) {
      return 0;
    }

    if(node == x) {
      return lev;
    }

    int l = level(node.left, x, lev+1);
    if (l != 0) {
      return l;
    }
    return level(node.right, x, lev+1);
  }
*/
