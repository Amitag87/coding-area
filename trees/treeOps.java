package trees;

public class treeOps {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }
    public static void preorder(Node root){
        if(root==null) return;
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    public static int size(Node root){
        if(root==null){
            return 0;
        }
        return 1+size(root.left)+size(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);
        root.left = a;
        root.right = b;
        Node c = new Node(6);
        Node d = new Node(5);
        a.left=c;
        a.right = d;
        Node e = new Node(11);
//        Node f = new Node(12);
        b.right=e;
//        e.left=f;
        preorder(root);
        System.out.println("no. of edges : "+size(root));
        System.out.println("sum of tree nodes is " + sum(root));
        System.out.println("maximum value of node "+ max(root));
        System.out.println("height of tree : "+height(root));
        System.out.println("minimum value of node "+ min(root));
        System.out.println("product of tree nodes is " + product(root));
    }
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        return root.val+sum(root.left)+sum(root.right);
    }
    public static int max(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val, Math.max(max(root.left),max(root.right)));
    }
    public static int height(Node root){
        if(root== null) return 0;
        if(root.left==null && root.right==null) return 0;
        return 1 + Math.max(height(root.left) ,height(root.right));
    }
    public static int min(Node root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.val,Math.min(min(root.left),min(root.right)));
    }
    public static int product(Node root){
        if(root==null){
            return 1;
        }
        int a=product(root.left)*product(root.right);
        return a*root.val ;
    }

}
