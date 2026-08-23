import java.util.*;

public class calc {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();
        System.out.print("Enter 1  for Additon\nEnter 2 for Subtraction\nEnter 3 For Multiplication\nEnter 4 for Division\n");
        int c = sc.nextInt();
        switch (c){
            case 1:
                System.out.println(a+b);
            break;
            case 2 :
                System.out.println(a-b);
            break;
            case 3 :
                System.out.println(a*b);
            break;
            case 4 :
                System.out.println(a/b);
            break;
            default:
                System.out.println("Invalid Input Please try again later");
        }
    }
    
}
