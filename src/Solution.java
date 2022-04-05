//import java.io.*;
//import java.util.*;
//
//public class Solution {
///******************************************************************************
//
// Online C++ Compiler.
// Code, Compile, Run and Debug C++ program online.
// Write your code in this editor and press "Run" button to compile and execute it.
//
// *******************************************************************************/
//
////#include <bits/stdc++.h>
////
////    using namespace std;
////
////    int main()
////    {
////        int n;
////        cin>>n;
////        int a[n];
////        for(int i = 0 ;i<n;i++)
////        {
////            cin>>a[i];
////        }
////        int num,diff,c = 0;
////        cin>>num>>diff;
////        for(int i = 0 ;i<n;i++)
////        {
////            if(abs(a[i]-num)<=2)
////            {
////                c++;
////            }
////        }
////        cout<<c<<endl;
////
////        return 0;
////    }
//
//    public void ans(int arr[],int num){
//        int c  = 0,diff;
//        for(int i  =0;i<arr.length;i++){
//            if((Math.abs(arr[i])-num)<=2){
//                c++;
//            }
//        }
//        System.out.println(c);
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////    public int balance(String s){
////        int  a=0,b = 0;
////        int x = 0;
////        for(int i =0;i<s.length();i++)
////        {
////            if(s.charAt(i)=='A'){
////                a++;
////            }
////            else if(s.charAt(i)=='B'){
////                b++;
////            }
////            if(a == b){
////                x++;
////            }
////        }
////
////        return x;
////    }
//    public void check(int arr[],int total) {
//        if (arr == null) {
//            System.out.println(-1);
//        }
//        else {
//            int c = 0, sum = 0;
//            for (int i = 0; i < arr.length; i++) {
//                sum = sum + arr[i];
//                c++;
//                if (sum >= total) {
//                    System.out.println(c);
//                    break;
//                }
////                else {
////                    System.out.println(0);
////                    break;
////                }
//            }
//            System.out.println(0);
//        }
//    }
//
//        public static void main(String[] args) {
////            int rat = 7;
////            int e = 2;
////            int x = 8;
////            int arr[] = {2, 8, 3, 5, 7, 4, 1, 2};
//
//            Scanner sc = new Scanner(System.in);
////            String s = sc.next();
//            int n = sc.nextInt();
//            int arr[]= new int [n];
//            for(int i = 0 ;i<n;i++)
//            {
//                arr[i] = sc.nextInt();
//            }
//            int num = sc.nextInt();
//            int diff = sc.nextInt();
//
//            Solution obj = new Solution();
//            obj.ans(arr,num);
////            System.out.println(obj.balance(s));
//          //  obj.check(arr,rat*e);
//
//        }
//    }



import java.io.*;
import java.util.*;

public class Solution {
    public int checkpass(String s) {
        int c = 0, n = 0, C = 0;
        if (s.charAt(0) >= '0' && s.charAt(0) <= '9')
            return 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i) == '/') {
                return 0;
            }
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                c++;
            }
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                n++;
            }
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                C++;
        }
        if (s.length()>= 4 && c >= 1 && n >= 1) {
            return 1;
        }
        return 0;
    }


    public static void main(String[] args) {
        Solution ss = new Solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(ss.checkpass(s));

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}