package Searching;

import java.util.Scanner;
public class LinearSearchDemo {
    static int arr[];
    LinearSearchDemo(int len){
        arr = new int[len];
    }
    public int Search(int arr[],int length,int element ){
        int i  = 0;
        while(i<length){
            if(arr[i]==element){
              return i+1;
            }
            i++;
        }
        return -1;
    }
    public  static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array : ");
        int len = sc.nextInt();
        LinearSearchDemo ls = new LinearSearchDemo(len);
        System.out.println("Enter the Element of the Array : ");
        for(int i =0;i<len;i++){
            arr[i] = sc.nextInt();;
        }
        System.out.println("Enter the Number You want to serch : ");
        System.out.println("Result : "+ ls.Search(arr,len, sc.nextInt()));
    }
}