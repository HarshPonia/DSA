package Tree_Data_Structure;

import Queue.QueueWithLinkedList;

import java.util.Scanner;

public class Binary_search_tree {
  public  class Node {
      Node left;
      Node right;
      int data;
      public Node(int d)
      {
          this.data = d;
          left = null;
          right = null;
      }
  }
  Node root;
  public Binary_search_tree(){
      root =null;
  }
  public void insert(Node temproot,int d){
      Node temp = null;
      while (temproot!=null){
          temp = temproot;
          if (d == temproot.data){
              return;
          }
          else if (d < temproot.data){
              temproot = temproot.left;
          }
          else if(d> temproot.data){
              temproot=temproot.right;
          }
      }
      Node new_node = new Node(d);
      if(root!=null){
          if(d< temp.data)
            temp.left=new_node;
          else
              temp.right =new_node;
      }
      else
          root = new_node;
  }
  // Insertion the element by recursion
  public Node InserRecurrsive(Node temp ,int d){
      if(temp!=null){
          if(d<temp.data){
              temp.left = InserRecurrsive(temp.left,d);
          }
          else if(d> temp.data){
              temp.right = InserRecurrsive(temp.right,d);
          }
      }
      else{
          Node new_node = new Node(d);
          temp = new_node;
      }
      return temp;
  }
  public void inorder(Node temp){
      if(temp!=null){
          inorder(temp.left);
          System.out.println(temp.data +" ");
          inorder(temp.right);
      }
  }
  public void preorder(Node temp){
      if(temp!=null){
          System.out.println(temp.data+" ");
          preorder(temp.left);
          preorder(temp.right);
      }
  }
  public void postorder(Node temp){
      if(temp!=null){
          postorder(temp.left);
          postorder(temp.right);
          System.out.println(temp.data+" ");
      }
  }
   int min(Node root){
      if(root.left==null){
          return root.data;
      }
      return min(root.left);
   }
  public Node Delete(Node root,int d){
      if(root==null){
        return null;
      }
      else if(d<root.data){
          root.left = Delete(root.left,d);
      }
      else if(d>root.data){
          root.right = Delete(root.right,d);
      }
      else {
          if(root.left==null){
              return root.right;
          }
          else if(root.right==null){
              return root.left;
          }
          root.data =min(root.right);
          root.right = Delete(root.right,root.data);
      }
      return root;
  }
  public Boolean seaching(int d){
      Node temp = root;
      while (temp!=null){
          if(temp.data == d)
              return true;
          else if(d< temp.data)
              temp = temp.left;
          else if(d>temp.data)
              temp = temp.right;
      }
      return false;
  }
    public static void main(String[] args) {
        Binary_search_tree bst = new Binary_search_tree();
        Scanner sc = new Scanner(System.in);
        bst.root = bst.InserRecurrsive(bst.root,50);
        bst.InserRecurrsive(bst.root,20);
        bst.InserRecurrsive(bst.root,70);
        bst.InserRecurrsive(bst.root,90);
        bst.InserRecurrsive(bst.root,150);
        bst.InserRecurrsive(bst.root,10);
        bst.InserRecurrsive(bst.root,159);
        System.out.println("Inorder Traversal : ");
        bst.inorder(bst.root);
        System.out.println("Preorder Traversal : ");
        bst.preorder(bst.root);
        System.out.println("Postorder Traversal : ");
        bst.postorder(bst.root);
        System.out.println("Enter the element to search  : ");
        System.out.println(bst.seaching(sc.nextInt()));
        System.out.println("Deleted element : ");
        bst.Delete(bst.root, 10);
        System.out.println("Inorder Traversal : ");
        bst.inorder(bst.root);
    }
}