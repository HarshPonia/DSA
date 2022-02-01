import java.util.Scanner;

public class Min_Deletions {
    void check(String s){
        int c =0;
//        char ch[]  = new char[s.length()];
//        for (int i =0;i<s.length();i++)
//        {
//            ch[i] = s.charAt(i);
//        }
        for (int i =0;i<s.length()-1;i++){
            if(s.charAt(i)== s.charAt(i+1)){
                c++;
            }
        }
        System.out.println(c);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S =  sc.next();
        Min_Deletions obj = new Min_Deletions();
        obj.check(S);
    }

}
