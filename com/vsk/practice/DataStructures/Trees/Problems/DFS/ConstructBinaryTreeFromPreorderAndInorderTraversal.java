package com.vsk.practice.DataStructures.Trees.Problems.DFS;

import com.vsk.practice.DataStructures.Trees.Problems.TreeNode;

/**
 * created by : v1dya-sagar on 11-07-2024
 *
 * @author : v1dya-sagar
 * @date : 11-07-2024
 * @project : JavaPractice
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0, 0, inorder.length - 1, preorder, inorder);
    }

    public TreeNode helper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preStart > preorder.length - 1 || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int inIndex = 0; // Index of current root in inorder
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == root.val) {
                inIndex = i;
            }
        }
        root.left = helper(preStart + 1, inStart, inIndex - 1, preorder, inorder);
        root.right = helper(preStart + inIndex - inStart + 1, inIndex + 1, inEnd, preorder, inorder);
        return root;
    }
}
// class Solution {
//   public TreeNode buildTree(int[] preorder, int[] inorder) {

//       if (preorder.length == 0) {
//         return null;
//       }

//       int r = preorder[0];
//       int index = 0;

//       for(int i=0; i<inorder.length; i++) {
//         if(inorder[i] == r) {
//           index = i;
//         }
//       }

//       TreeNode node = new TreeNode(r);

//       node.left = buildTree(Arrays.copyOfRange(preorder, 1, index + 1), Arrays.copyOfRange(inorder, 0, index));
//       node.right = buildTree(Arrays.copyOfRange(preorder, index + 1, preorder.length), Arrays.copyOfRange(inorder, index + 1, inorder.length));

//       return node;

//     }
// }
