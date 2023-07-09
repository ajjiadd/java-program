package Method_parameter;

public class example_1 {
        //1st function
    static void method(String name, int x){
        System.out.println(name + "is" +  x);
    }
        //2nd function
    static int method2(int x){
        return 5 + x;
    }

    //3rd function
    static int mathod3(int x1, int y1){
        return x1+y1;
    }

    //4th function
    static int mathod4(int x4, int y4){
        return x4 / y4;
    }

    //5th function
    static void checkage(int x5){
        if(x5 < 18){
            System.out.println("Your are under 18");
        }else{
            System.out.println("Your are 18+");
        }
    }


    //6th function
    static double mathod6(double x6, double y6){
        return x6 + y6;
    }


    public static void main(String[] args){
        //1st function call
        method("jiad ",  21);

        //2nd function call
        System.out.println(method2(5));

        //3rd function call
        System.out.println(mathod3(10,20));


        //4th function call
        int z4 = mathod4(30,2);

        System.out.println(z4);

        //5th function call

        checkage(20);

        //6th function call

        double z6 = mathod6(3.70, 0.30);
        System.out.println("CGPA = " + z6);


    }
}
