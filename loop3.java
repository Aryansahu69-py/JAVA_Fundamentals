import java.util.*;
//do while loop implimentation
public class loop3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you want the Table");
        int a = sc.nextInt();
        int i = 1;
        do {
            System.out.println(a+"X"+ i + "=" + (a*i));
            i= i+1;
        }while(i<11);
    
    
    
    }
}
