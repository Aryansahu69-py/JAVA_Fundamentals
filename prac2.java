import java.util.Scanner;

public class prac2 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();
        if(a>b)
            System.out.println(a + " is greater than " + b);
        else
            System.out.println(b + " is greater than " + a);
    }
}
