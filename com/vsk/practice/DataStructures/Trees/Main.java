import com.vsk.practice.DataStructures.Trees.BinarySearchTree;
import com.vsk.practice.DataStructures.Trees.BinaryTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         BinaryTree binaryTree = new BinaryTree();
         binaryTree.populate(scanner);
         binaryTree.prettyDisplay();

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
        binarySearchTree.populate(nums);
        binarySearchTree.display();
    }
}