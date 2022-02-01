import java.io.*;
import java.util.*;

public class Solution {

    public int balance(String s){
        int  a=0,b = 0;
        int x = 0;
        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i)=='A'){
                a++;
            }
            else if(s.charAt(i)=='B'){
                b++;
            }
            if(a == b){
                x++;
            }
        }

        return x;
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.balance(s));

        }
    }