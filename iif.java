import java.util.*;


public class iif {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter Your age ");
        int a = sc.nextInt();
        if(a >= 18){
            System.out.println("You are an Adult");
        }
        else{
            System.out.println("You are minor");
        }
    }
    
}
