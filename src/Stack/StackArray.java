package Stack;

import java.util.Scanner;

public class StackArray {
    int top;
    static final int max = 5;
    int arr[] = new int [max];
    StackArray(){
        top = -1;
    }
    public boolean IsEmpty(){
        return top<0;
    }
    public void push(int d){
        if(top>max-1){
            System.out.println("Stack Overflow ");
        }
        else{
            arr[++top] = d;
//            System.out.println(d + "Pushed Success ");
        }
    }
    public int pop(){
        int e = 0;
        if(IsEmpty()){
            System.out.println("Stack is Underflow ");
        }
        else{
            e = arr[top];
            top--;
        }
        return e;
    }
    public int peek(){
        if(IsEmpty()){
            System.out.println("Stack is underflow ");
            return 0;
        }
        else {
            int x = arr[top];
            return x;
        }
    }
    public void display(){
        if(IsEmpty()){
            System.out.println("Stack is Underflow ");
        }
        else{
            for (int i = top;i>-1;i--){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StackArray obj = new StackArray();
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<max;i++){
            obj.push(sc.nextInt());
        }
        obj.display();
        System.out.println(obj.pop());
//        System.out.println(obj.peek());

    }

}
