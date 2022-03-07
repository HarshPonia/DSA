package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_Recursive {
    public int Recursive_Serach(int arr[],int data,int l,int r){
        if(l>r)
            return -1;
        else {
            int m  = (l+r)/2;
            if(data == arr[m])
                return m;
            else if(data<arr[m])
                return Recursive_Serach(arr,data,l,m-1);
            else if(data>arr[m])
                return  Recursive_Serach(arr,data,m+1,r);
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch_Recursive boj = new BinarySearch_Recursive();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n  = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array element : ");
        for(int i =0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the elemwnt You want to search : ");
        System.out.println("Result : " + boj.Recursive_Serach(arr, sc.nextInt(), 0,n-1));
    }
}
