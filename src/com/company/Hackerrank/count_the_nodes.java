package com.company.Hackerrank;


public class count_the_nodes {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    public  void insert(int d){
        Node new_node = new Node(d);
        if(head == null){
            head = new_node;
        }
        else {
            Node last = head;
            while(last.next!=null){
                last = last.next;
            }
            last.next = new_node;

        }
    }
    public void print(){
        if(head == null){
            System.out.println("null");
        }
        else{
            int c =0;
            Node curnode = head;
            while(curnode != null){
                if(curnode.data%2==0){
                    c++;
                }
                curnode = curnode.next;
            }
            System.out.println(c);
        }

    }
    public static void main(String[] args) {
        count_the_nodes ls = new count_the_nodes();
        ls.insert(10);
        ls.insert(20);
        ls.insert(30);
        ls.print();
    }
}
