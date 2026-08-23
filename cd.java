import java.util.*;


public class cd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();
        if (a==b){
            System.out.println("Both are equal");
        }else if (a>b) {
            System.out.println("First number is greater than ");
        }else {
            System.out.println("First is lesser");
        }
    }
}
