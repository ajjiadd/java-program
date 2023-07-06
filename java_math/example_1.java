package java_math;

public class example_1 {
    public static void main(String[] args){
        //max value
        System.out.println(Math.max(5, 10) + "\n");
        
        //min value
        System.out.println(Math.min(10, 6) + "\n");

        //square root 
        System.out.print((int)Math.sqrt(25) + "\n");  //int
        System.out.print(Math.sqrt(25) + "\n");     //float

        // the absolute (positive) value
        System.out.println(Math.abs(-4.50) + "\n");

        //returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
        System.out.println(Math.random());

        //To get more control over the random number, for example, if you only want a random number between 0 and 100, you can use the following formula
        int random = (int)(Math.random()* 101);
        System.out.println(random);


        //another ways
        int x = 15;
        int y = 20;
        System.out.println("\n" + Math.max(x, y));
    }
}
