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
    // Inorder traversal of a BST
    static void inOrder(Node root) {
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    // Inserting in a BST using recursion
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
        // To find the position where the node is to be inserted
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
    private static Boolean searchInTree(int x){
        Node temp = root;
        while(temp != null){
            if(temp.data == x)
                return true;
            if(temp.data > x)
                temp = temp.left;
            else if(temp.data < x)
                temp = temp.right;
        }
        return false;
    }
    private static void deleteInTree(int x){
        /*Node temp = root;
        Node parent = null;
        while(temp != null){
            if(temp.data == x)
                break;
            parent = temp;
            if(temp.data > x)
                temp = temp.left;
            else if(temp.data < x)
                temp = temp.right;
        }
        if(temp == null)
            return;
        // Case 1: Node to be deleted is a leaf node
        if(temp.left == null && temp.right == null){
            if(temp != root){
                if(parent.left == temp)
                    parent.left = null;
                else
                    parent.right = null;
            }
            else
                root = null;
        }
        // Case 2: Node to be deleted has only one child
        else if(temp.left == null || temp.right == null){
            if(temp != root){
                if(parent.left == temp){
                    if(temp.left != null)
                        parent.left = temp.left;
                    else
                        parent.left = temp.right;
                }
                else{
                    if(temp.left != null)
                        parent.right = temp.left;
                    else
                        parent.right = temp.right;
                }
            }
            else{
                if(temp.left != null)
                    root = temp.left;
                else
                    root = temp.right;
            }
        }
        // Case 3: Node to be deleted has two children
        else{
            Node successor = temp.right;
            Node successorParent = null;
            while(successor.left != null){
                successorParent = successor;
                successor = successor.left;
            }
            if(successorParent != null)
                successorParent.left = successor.right;
            else
                temp.right = successor.right;
            temp.data = successor.data;
        }*/
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);
        int a = 1;
        while (a != 0){
            System.out.println("\nEnter Choice:");
            a = s.nextInt();
            switch(a){
                case 1 -> root = insertInTree(root, s.nextInt());
                case 2 -> inOrder(root);
                case 3 -> insertInTree(s.nextInt());
                case 4 -> System.out.println(searchInTree(s.nextInt()));
                case 5 -> deleteInTree(s.nextInt());
            }
        }
    }
}
