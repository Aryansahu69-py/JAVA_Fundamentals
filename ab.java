import java.util.*;


public class ab {
    public static void main(String args[]){
        System.out.println("Enter the First Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the second Number");
        int b = sc.nextInt();
        if (a==b){
            System.out.println("Both Numbers are equal");

        }else{
            if (a>b){
                System.out.println("First number is Greater than second Number");

            }else{
                System.out.println("Second Number is greater than First Number");

            }
        }
    }
}
