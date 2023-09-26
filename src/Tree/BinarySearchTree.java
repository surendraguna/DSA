package Tree;

import java.util.Scanner;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class BinarySearchTree {

    static Node root = null;
    static void inOrder(Node root) {
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static Node insertInTree(Node root, int n) {
        if(root == null){
            root = new Node(n);
            return root;
        }
        else if(root.data > n)
            root.left = insertInTree(root.left, n);
        else if(root.data < n)
            root.right = insertInTree(root.right, n);
        return root;
    }
    static void insertInTree(int x){
        Node n = new Node(x);
        if(root == null){
            root = n;
            return;
        }
        Node temp = root;
        while(true){
            if(temp.data == x)
                return;
            if(temp.data > x){
                if(temp.left == null){
                    temp.left = n;
                    return;
                }
                temp = temp.left;
            }
            else if(temp.data < x){
                if(temp.right == null){
                    temp.right = n;
                    return;
                }
                temp = temp.right;
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 1;
        while (a != 0){
            System.out.println("\nEnter Choice:");
            a = s.nextInt();
            switch(a){
                case 1 -> root = insertInTree(root, s.nextInt());
                case 2 -> inOrder(root);
                case 3 -> insertInTree(s.nextInt());
            }
        }
    }
}
