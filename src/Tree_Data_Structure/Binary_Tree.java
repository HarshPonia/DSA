package Tree_Data_Structure;

class Node{

    Node left;
    Node right;
    int d;
    Node(int d){
        this.d = d;
        left = null;
        right = null;
    }
}
public class Binary_Tree {
    Node root;
    Binary_Tree(int d){
        root = new Node(d);
    }
    Binary_Tree(){
        root = null;
    }
    // Inorder binary tree
    public void Inorder(Node node){
        if(node!=null){
            Inorder(node.left);
            System.out.println(" "+ node.d);
            Inorder(node.right);
        }
    }
    public void preorder(Node node){
        if(node!=null){
            System.out.println(" " + node.d);
            preorder(node.left);
            preorder(node.right);
        }
    }
    public void postorder(Node node){
        if(node != null){
            postorder(node.left);
            postorder(node.right);
            System.out.println(" " + node.d);
        }
    }
    public static void main(String[] args) {
        Binary_Tree obj = new Binary_Tree();
        obj.root = new Node(1);
        obj.root.left = new Node(2);
        obj.root.right = new Node(3);
        obj.root.left.left = new Node(4);
        obj.root.left.right= new Node(5);
        obj.root.right.left = new Node(6);
        obj.root.right.right = new Node(7);
        System.out.println("Preorder Traversal ");
        obj.preorder(obj.root);
        System.out.println("Inorder Traversal ");
        obj.Inorder(obj.root);
        System.out.println("Postorder traversal ");
        obj.postorder(obj.root);
    }
}
