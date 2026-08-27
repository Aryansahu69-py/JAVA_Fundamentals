public class logicalop {
    public static void main(String[] arg){
        System.out.println((1>2) && (3<4)); // if one condition is False then answer is False 
        System.out.println((2>1)||(8>9)); // if one Condition is true than answer will be true

        int a= 12 , b =22 ;
        System.out.println(a++ > 12 && b++ >= 22); 
        /* The First statement is false so because of AND operator the next operator will not 
        run and the value of b will not increase  */
        System.out.println(a + " " + b);
        System.out.println(a++ > 12 && b++ >= 22); 
        /* here Second Statement run due to OR operator which runs both the 
        statement for verification but if OR finds first statement true then it will 
        also do not check the Second statement */
        System.out.println(a + " " + b);

    }
}
