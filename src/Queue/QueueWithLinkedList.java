package Queue;

public class QueueWithLinkedList {
    Node front, rear;
    int size;

    class Node {
        Node next;
        int data;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    QueueWithLinkedList() {
        front = null;
        rear = null;
        size = 0;
    }

    public int length() {
        return size;
    }

    public boolean IsEmtyp() {
        return size == 0;
    }

    public void enqueue(int d) {
        Node new_node = new Node(d);
        if (IsEmtyp()) {
            front = new_node;
        }
        else {
            rear.next = new_node;
        }
        rear = new_node;
        size++;
    }

    public int dequeue() {
        if (IsEmtyp()) {
            System.out.println("Queue is Empty ");
            return -1;
        } else {
            int e = front.data;
            front = front.next;
            size--;
            if (IsEmtyp()) {
                rear = null;
            }
            return e;
        }
    }

    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp= temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        QueueWithLinkedList obj = new QueueWithLinkedList();
        obj.enqueue(10);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(40);
        obj.enqueue(40);
        System.out.println("Length  : "+obj.length());
        System.out.println("deleted element " + obj.dequeue());
        obj.display();
        System.out.println(obj.length());
    }
}