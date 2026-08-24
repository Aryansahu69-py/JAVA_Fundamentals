import java.util.*;

public class loop2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you want the table");
        int a = sc.nextInt();
        int i = 1;
        while (i<11){
            System.out.println(a + "X"+ i + "=" + (a*i));
            i++;
        }
    }
}
