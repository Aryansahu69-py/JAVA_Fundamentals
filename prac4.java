import java.util.*;

public class prac4 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Day number");
        int day =sc.nextInt();
        if (day <=4){
            if (day==1)
                System.out.println("It is Sunday");
            else if (day ==2)
                System.out.println("It is Monday");
            else if (day ==3)
                System.out.println("It is Tuesday");
            else 
                System.out.println("It is Wednesday");
        }
        else if (day > 4 && day <=7){
            if (day == 5)
                System.out.println("It is Thursday");
            else if (day == 6)
                System.out.println("It is Friday ");
            else 
                System.out.println("It is Saturday");

        }
        else
            System.out.println("Invalid Input");
    }
}
