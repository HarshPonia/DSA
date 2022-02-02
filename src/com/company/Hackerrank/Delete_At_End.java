package com.company.Hackerrank;

import java.util.Scanner;

public class Delete_At_End {
    Node head;
    static class Node{
        Node next;
        int data;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void insert(int d){
        Node newnode = new Node(d);
        if(head == null){
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next!= null){
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.next = null;
        }
    }
    public void delete(){
        if (head == null)

            if (head.next == null) {
            }

        // Find the second last node
        Node second_last = head;
        while (second_last.next.next != null)
            second_last = second_last.next;

        // Change next of second last
        second_last.next = null;


    }
    public  void print(){
        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.data+ " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Delete_from_beg obj = new Delete_from_beg();
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            obj.insert(sc.nextInt());
        }
        obj.delete();
        obj.print();
    }
}
