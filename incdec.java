
//This About Increment and Decrement and there type post and pre
public class incdec {
    public static void main(String arg[]){
        int a = 12;
        int b = 20;
        System.out.println(a++); // post-increment 
        System.out.println(a);
        System.out.println(++a);// this pre-increment 

        int c= 10 , d = 6 ;
        int e = ++c + c++ + --d + d--; // answer should be 32
        System.out.println(e);
    }
}
