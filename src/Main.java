import java.util.Scanner;
public class Main {
    public static int recurFibo(int num) {
        if(num == 0)
            return 0;
        else if(num == 1 || num == 2)
            return 1;
        else
            return recurFibo(num-1) + recurFibo(num-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position : ");
        int num = sc.nextInt();
        System.out.println("Value : " + recurFibo(num-1));
    }
}
