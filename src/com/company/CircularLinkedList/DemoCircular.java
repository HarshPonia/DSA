package com.company.CircularLinkedList;

import java.util.Scanner;

public class DemoCircular {
    Node tail;
    int size;
    Node head;
    static class Node{
        Node next;
        int data;
        Node(int d){
            data = d;
            next = null;
        }
    }
    DemoCircular(){
        tail = null;
        size = 0;
        head = null;
    }
    public  int length(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void InsertAtEnd(int d){
     Node new_node = new Node(d);
     if(isEmpty()){
         new_node.next = new_node;
         head =  new_node;
     }
     else{
         new_node.next = tail.next;
         tail.next = new_node;
     }
     tail = new_node;
        size++;
    }
    public void insertAtBeg(int d){
        Node new_node = new Node(d);
        if(isEmpty()){
            new_node.next = new_node;
            head = new_node;
        }
        else{
            tail.next = new_node;
            new_node.next = head;
            head = new_node;

        }
//        tail = new_node;
        size++;
    }
    public void InserAtPos(int d,int pos) {
//        Node new_node = new Node(d);
//        if(isEmpty()){
//            if(pos!= 1){
//                System.out.println("Invalid position");
//            }
//            else {
//                new_node.next = new_node;
//                head = new_node;
//            }
//        }
//        else{
//            if(pos>size+1){
//                System.out.println("Invalid Position ");
//            }
//            else{
//                int i = 1;
//                Node currnode = head;
//                while(i<pos-1){
//                    currnode = currnode.next;
//                    i++;
//                }
//                new_node.next = currnode.next;
//                currnode.next = new_node;
//                size++;
//            }
//        }
        Node new_node = new Node(d);
        if (pos <= 0 || pos >= size) {
            System.out.println("Invlid position : ");
        }
        else {
            if (pos == 1) {
                tail.next = new_node;
                new_node.next = head;
                head = new_node;
            }
            else {

                Node temp = head;
                int i = 1;
                while (i < pos - 1) {
                    temp = temp.next;
                    i = i + 1;
                }
                new_node.next = temp.next;
                temp.next = new_node;
            }
            size++;
        }
    }
    public void display(){
        int i =0;
        Node currnode = head;
        while (i<length()){
            System.out.print(currnode.data + " ");
            currnode = currnode.next;
            i++;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        DemoCircular obj = new DemoCircular();
//        Scanner sc = new Scanner(System.in);
//        int n  = sc.nextInt();
//        for(int i =0;i<n;i++){
//            obj.InsertAtEnd(sc.nextInt());
//        }
////        obj.insertAtBeg(sc.nextInt());
////        obj.display();
//        System.out.println("Enter the element and position : ");
//        obj.InserAtPos(sc.nextInt(), sc.nextInt());
//        System.out.println("Length of Linked List  : " + obj.length());
//        obj.display();
//        obj.insertAtBeg(10);
        obj.InsertAtEnd(30);
        obj.InsertAtEnd(20);
        obj.insertAtBeg(10);

        obj.InserAtPos(40 ,1);
        obj.display();
        System.out.println("The size of Linked List is : "+ obj.length());
    }

}
