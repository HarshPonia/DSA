package Single_LinkedList;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Linked_List {
    static Node head;

    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }

    }
    public  static  int  searching(int x){
        Node currnode = head;
        while(currnode.data != x){
            currnode = currnode.next;
        }
        System.out.print("found ");
    return currnode.data;
    }
    public static  Linked_List insert(Linked_List ls,int data,int x){
        Node new_node = new Node(data);
        // if list is empty
        if(head==null){
            head = new_node;
        }
        // insert the element at beginning
        else if(x == 1){
            new_node.next = head;
            head = new_node;
        }
        // insert element at end
        else if(x == 0){
            new_node.next =null;
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
        else{
            int num = searching(x);

        }
        return  ls;
    }
    public static void deletion(){

    }
    public static void print(Linked_List ls) {
        Node curnode = head;
        System.out.println("Linked list is : ");
        while (curnode != null) {
            System.out.print(curnode.data + " ");
            curnode = curnode.next;
        }
    }


    public static void main(String[] args) {
        Linked_List ls = new Linked_List();
        Scanner sc = new Scanner(System.in);
        ls = insert(ls,2,0);
        ls = insert(ls,1,1);
        ls = insert(ls,3,0);
        ls = insert(ls,4,0);
//        System.out.println("Enter data to search: ");
//        System.out.println(searching(sc.nextInt()));
//        print(ls);
//        System.out.println(ls.count_Node());
    }
}
