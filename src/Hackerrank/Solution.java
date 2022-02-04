package Hackerrank;

import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class Solution {
    Node head;
    public void print(){
        Node currnode = head;
        while(currnode.next!= null){
            System.out.print(currnode.data+" ");
            currnode = currnode.next;
        }
    }
    public void insertAtbeg(int d) {
        Node new_node = new Node(d);
        if (head == null) {
            head = new_node;
            new_node.next = null;
        } else {
            new_node.next = head;
            head = new_node;
        }
    }
        public static void main (String[]args){
            Solution obj = new Solution();
            Scanner sc = new Scanner(System.in);
            int n;
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                obj.insertAtbeg(sc.nextInt());
            }
            // obj.print();
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        }
    }