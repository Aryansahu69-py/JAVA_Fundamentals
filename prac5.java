import java.util.*;

public class prac5 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Shoping Amount");
        int a= sc.nextInt();
        if ( a<=7000){
            if (a>0 && a<=5000){
                System.out.println("Your Discount will be of 0%");
                System.out.println("So pay the Full Amount");
            }else{
                System.out.println("Your discount will of 5%");
                double b = a-(a*0.05);
                System.out.println("So your Final Amount is " + b );
            }
         }else{
            if ( a>7001 && a<=9000){
                System.out.println("Your discount will be of 10%");
                double c = a-(a*0.1);
                System.out.println("So your Final Amount is " + c);

            }else{
                System.out.println("Your discount will be of 20%");
                double d = a-(a*0.2);
                System.out.println("So your Final Amount is " + d);
            }
         }
    }
    
}
