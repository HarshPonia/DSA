package Tree_Data_Structure;

public class AVL_tree {
    class Node {
        public int height;
        int data;
        Node left;
        Node right;
        Node(int d){
            this.data =d;
            left = null;
            right = null;
            height = 1;
        }
    }
    Node root;
    public AVL_tree() {
        Node root;
    }
    int height(Node temp){
        if(temp == null){
            return 0;
        }
        return temp.height;
    }
    int max(int a, int b) {
        return (a > b) ? a : b;
    }
    public int balanceFactor(Node temp){
        if(temp==null)
        {
            return 0;
        }
        return  height(temp.left)-height(temp.right);
    }
    public Node rightrotate(Node temp){
        Node t1 = temp.left;
        Node t2 = t1.right;
        t1.right = temp;
        temp.left = t2;
        temp.height = max(height(temp.left),height(temp.right))+1;
        t1.height = max(height(t1.left),height(t1.right))+1;
        return t1;
    }
    public  Node leftRotate(Node temp){
        Node t1 = temp.right;
        Node t2 = t1.left;
        t1.left = temp;
        temp.right = t2;
        temp.height = max (height(temp.left), height(temp.right))+1;
        t1.height = max(height(t1.left),height(t1.right))+1;
        return t1;
    }
    public Node insert(Node temp, int d){
        if(temp ==null)
            return (new Node(d));
        if(d<temp.data)
            temp.left = insert(temp.left,d);
        else if(d>temp.data)
            temp.right =  insert(temp.right,d);
        else
            return temp;
        temp.height = 1+max(height(temp.left),height(temp.right));
        int b = balanceFactor(temp);
        if(b>1 && d<temp.left.data){
                return rightrotate(temp);
        }
         if(b<-1 && d>temp.right.data){
            return leftRotate(temp);
        }
         if(b>1 && d>temp.left.data){
            temp.left = leftRotate(temp.left);
            return rightrotate(temp);
        }
         if(b<-1 && d<temp.right.data){
            temp.right = rightrotate(temp.right);
            return  leftRotate(temp);
        }
        return temp;
    }
    int min(Node root){
        if(root.left==null){
            return root.data;
        }
        return min(root.left);
    }
    public Node delete(Node temp,int d){
        if(temp==null){
            return null;
        }
        else if(d<temp.data){
            temp.left = delete(temp.left,d);
        }
        else if(d>temp.data){
            temp.right = delete(temp.right,d);
        }
        else {
            if(temp.left==null){
                return temp.right;
            }
            else if(temp.right==null){
                return temp.left;
            }
            temp.data =min(temp.right);
            temp.right = delete(temp.right,temp.data);
        }
        temp.height = 1+max(height(temp.left),height(temp.right));
        int b = balanceFactor(temp);
        if(b>1 && d<temp.left.data){
            return rightrotate(temp);
        }
        if(b<-1 && d>temp.right.data){
            return leftRotate(temp);
        }
        if(b>1 && d>temp.left.data){
            temp.left = leftRotate(temp.left);
            return rightrotate(temp);
        }
        if(b<-1 && d<temp.right.data){
            temp.right = rightrotate(temp.right);
            return  leftRotate(temp);
        }
        return root;
    }
    public void preorder(Node temp){
        if (temp!=null){
            System.out.println(temp.data + " ");
            preorder(temp.left);
            preorder(temp.right);
        }
    }
    public static void main(String[] args) {
        AVL_tree obj = new AVL_tree();
        obj.root = obj.insert(obj.root,10);
        obj.root = obj.insert(obj.root,20);
        obj.root = obj.insert(obj.root,30);
        obj.root = obj.insert(obj.root,40);
        obj.root = obj.insert(obj.root,50);
        obj.root = obj.insert(obj.root,25);
        System.out.println("Preorder traversal");
        obj.preorder(obj.root);
        System.out.println("Preorder after deletion : ");
        obj.delete(obj.root,25);
        obj.preorder(obj.root);


    }
}
