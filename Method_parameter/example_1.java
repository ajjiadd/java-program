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
    public static void main(String[] args){
        //1st function call
        method("jiad ",  21);

        //2nd function call
        System.out.println(method2(5));



    }
}
