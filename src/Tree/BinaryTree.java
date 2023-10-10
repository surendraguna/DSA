package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node root = null;
    // Inorder Display the tree
    public static void inOrder(Node root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    // PreOrder Display tree
    private static void preOrder(Node root) {
        if(root == null)
            return;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    //PostOrder Display tree
    private static void postOrder(Node root){
        if(root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
    // Insertion of Binary Tree
    static void addElement(int x){
        Node n = new Node(x);
        if(root == null){
            root = n;
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (!q.isEmpty()){
            Node temp = q.peek();
            q.remove();
            if(temp.left == null){
                temp.left = n;
                return;
            }
            else
                q.add(temp.left);
            if(temp.right == null){
                temp.right = n;
                return;
            }
            else
                q.add(temp.right);
        }
    }
    // Height of Binary Tree
    static int height(Node root){
        if(root == null)
            return 0;
        int l = height(root.left);
        int r = height(root.right);
        return Math.max(l, r) + 1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 1;
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left  = new Node(6);
        root.right.right = new Node(7);
        /*root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.left.right.left  = new Node(10);
        root.left.right.right = new Node(11);
        root.right.left.left = new Node(12);
        root.right.left.right = new Node(13);
        root.right.right.left  = new Node(14);
        root.right.right.right = new Node(15);*/
        while(a != 0){
            System.out.println("Enter Choice:");
            a = s.nextInt();
            switch (a){
                case 1 -> addElement(s.nextInt());
                case 2 -> inOrder(root);
                //case 3 -> deleteNode();
                /*case 3 -> preOrder(root);
                case 4 -> postOrder(root);*/
                case 5 -> System.out.println(height(root));
            }
        }

    }
}
