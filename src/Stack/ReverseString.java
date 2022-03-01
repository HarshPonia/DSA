package Stack;

import java.util.Scanner;

public class ReverseString {
    static int top;
    static char a[];
    ReverseString(int n){
        top = -1;
        a= new char[n];
    }
    static void push(char ch){
        a[++top] = ch;
    }
    static char pop(){
        char c = a[top--];
        return c;
    }
    void check(String s){
        String st = "";
        for (int i = 0;i<s.length();i++){
            push(s.charAt(i));
        }
        for (int i =0;i<s.length();i++){
           char c =  pop();
           st = st+c;
        }
        System.out.println("Reverse String is : " + st);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Str = sc.nextLine();
        ReverseString obj = new ReverseString(Str.length());
        obj.check(Str);
    }
}
