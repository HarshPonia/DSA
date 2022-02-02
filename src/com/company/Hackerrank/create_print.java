package com.company.Hackerrank;


import java.util.Scanner;

public class create_print {
    static Node head;
    static class Node{
        int data;
        Node next;

        // Constructor
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public static create_print insert(create_print ls ,int d){
        Node new_node = new Node(d);
        if(head == null){
            head = new_node;

        }
        else{
            new_node.next = null;
            Node temp = head;
            while (temp.next!= null) {
                temp = temp.next;
            }
            temp.next = new_node;

        }
        return ls;
    }
    public static void print(create_print ls){
        Node curnode = head;
        if(head==null){
            System.out.println("null");
        }
        while(curnode!=null){
            System.out.print(curnode.data+" ");
            curnode = curnode.next;
        }
    }
    public static void main(String[] args) {
        create_print ls = new create_print();
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i =0;i<n;i++){
            ls = insert(ls,sc.nextInt());
        }
        print(ls);
    }
}
