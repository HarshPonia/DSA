package com.company.Hackerrank;

import java.util.Scanner;

public class Insert_At_position {
    Node head;
    static  class Node{
        int data;
        Node next;
        Node(int d){
            next = null;
            data = d;
        }
    }
    public void print(){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public int count(){
        Node temp = head;
        int c=0;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        return c;
    }
    public void insertAtPos(int d,int pos){
            Node n = new Node(d);
            if(head==null){
                if(pos!=1){
                    System.out.println("Invalid Position");
                }
                else{
                    head = n;
                }
            }
            else{
                if(pos==1){
                    n.next = head;
                    head = n;
                }
                else if(pos>count()+1){
                    System.out.println("Invalid Position");
                }
                else{
                    Node temp = head;
                    int c=1;
                    while(temp!=null){
                        if(c==pos-1){
                            break;
                        }
                        c++;
                        temp = temp.next;
                    }
                    n.next = temp.next;
                    temp.next = n;
                }
            }
    }
    public void insert(int d){
        Node new_node = new  Node(d);
        if(head== null){
            head = new_node;
        }
        else {
            Node currnode =head;
            while(currnode.next!= null){
                currnode = currnode.next;
            }
            currnode.next = new_node;
        }
    }
    public static void main(String[] args) {
        Insert_At_position obj = new Insert_At_position();
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for(int i =0;i<n;i++) {
            obj.insert(sc.nextInt());
        }
        obj.insertAtPos(sc.nextInt(), sc.nextInt());
        obj.print();
    }
}
