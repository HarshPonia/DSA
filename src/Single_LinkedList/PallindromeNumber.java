package Single_LinkedList;

import java.util.Scanner;
public class PallindromeNumber {
    static int top;
    static int arr[];
    PallindromeNumber(int size){
        top = -1;
        arr = new int[size];
    }
    static int length(int n){
        int c  =0;
        while(n>0)
        {
            c++;
            n=n/10;

        }
        return c;
    }
    static void push (int a){
        arr[++top] = a;
    }
    static int pop(){
        int e  = arr[top--];
        return e;
    }
    void Ans(int n){
        int r = 0,temp = n,s = 0;
        while(n>0) {
            r = n % 10;
//            s=(s*10)+r;
            n = n / 10;
            push(r);
        }
        int l =length(temp);
        for(int i =0;i<l;i++){
            int x = pop();
            s=(s*10)+x;
        }
        if(s == temp ){
            System.out.println("Pallindrome");
        }
        else {
            System.out.println("Not Pallindrome");
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        PallindromeNumber obj = new PallindromeNumber(length(20));
        obj.Ans(20);
    }
}
