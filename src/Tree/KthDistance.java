package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KthDistance {
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }
    static Node root = null;
    static ArrayList<Integer> kthDistance(Node root, int k, int target){
        ArrayList<Integer> a = new ArrayList<>();
        if(root == null) return a;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node temp = q.peek();
            q.remove();
            if(temp.data == target)
                break;
            if(temp.left != null)
                q.add(temp.left);
            if(temp.right != null)
                q.add(temp.right);
        }

        for(Node n : q)
            System.out.println(n.data);

        return a;

    }

    public static void main(String[] args) {
        root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right = new Node(30);
        root.right.right = new Node(70);
        root.right.left = new Node(60);
        System.out.println(kthDistance(root, 2, 40));
    }
}
