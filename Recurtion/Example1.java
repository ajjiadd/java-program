package Recurtion;

public class Example1 {

    public static void main(String[] args){
        //1st function call;
        int xxx = sum(10);
        System.out.println(xxx);

        //2nd function call
        int matt2 = mat2(5, 10);
        System.out.println(matt2);

    }

    //1st function;

    public static int sum(int x1){
        
            if(x1 > 0){
                return x1 + sum(x1 - 1);
            }else{
                return 0;
            }
    }

    //2nd function
    public static int mat2(int start, int end){
        if(end > start){
            return end + mat2(start, end - 1);
        }else{
            return end;
        }
    }



}
