import java.util.Scanner;



public class jl {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the button");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Namaste");
                break;
            case 2:
                System.out.println("Hello");
                break;
            case 3 :
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Input");
                
        }
    }
    
}
