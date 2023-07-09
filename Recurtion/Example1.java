package Recurtion;

public class Example1 {

    public static void main(String[] args){
        //1st function call;
        System.out.println(sum(10));

    }

    //1st function;

    public static int sum(int x1){
            if(x1 > 0){
                return x1 + sum(x1 - 1);
            }else{
                return 0;
            }
    }

    



}
