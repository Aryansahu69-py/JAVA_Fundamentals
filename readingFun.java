import java.util.Scanner;
public class readingFun {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age =sc.nextInt();

        sc.nextLine();  //if this is not here then if we press the Enter then in it wll skip next input 
                       // and carry on
        System.out.println("Enter your name");
        String name = sc.nextLine(); // nextLine also takes Enter as input so above sc.nextline is given
        System.out.println("You are "+ name + " and your age is" + age);

    }
}
