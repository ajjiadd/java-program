package java_casting;

public class example_1 {
    public static void main(String[] args){
        //Narrowing Casting
        double one = 356.4d;
        int two = (int) one;
        //Widening Casting
        int three = 345;
        double four = three;
        System.out.println(two);
        System.out.println(four);
    }
}
