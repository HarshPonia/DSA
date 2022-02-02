package com.company;

import java.util.Scanner;

public class Reverse {


   public static int Answer(int n){
        int d =0 ,x= 0;
        while(n>0){
            d = n%10;
            x = x*10+d;
            n = n/10;
        }
        return  x;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        System.out.println(Answer(n));
    }
}

