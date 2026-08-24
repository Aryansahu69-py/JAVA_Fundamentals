import java.util.*;
public class nthsum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which you want sum");
        int a = sc.nextInt();
        int sum = 0;
        for(int i=1 ; i<=a; i++ ){
            sum = sum + i;
            
        }
        System.out.println(sum);
    }
}
