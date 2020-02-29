import node.MyBinarySearchTree;
import node.TreeNode;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        MyBinarySearchTree tree  = new MyBinarySearchTree();

        tree.insert(2);
        tree.insert(3);
        tree.insert(23);
        tree.insert(234);
        tree.insert(34);
        tree.insert(32);
        TreeNode root = tree.getRoot();
        tree.treverseInOrder(root);
        System.out.println();
        tree.treversePreOrder(root);
        System.out.println();
        tree.treversePostOrder(root);

    }
}