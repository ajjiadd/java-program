package java_If_Else;

public class if_else {
    public static void main(String[] args){
        //Less than: a < b
        //Less than or equal to: a <= b
        //Greater than: a > b
        //Greater than or equal to: a >= b
        //Equal to a == b
        //Not Equal to: a != b
        
        //example: 01
        if(20>15){
            System.out.println("20 is greater then 15");
        }

        //example: 02
        int x = 15;
        int y = 20;
        if(y<x){
            System.out.println("y is greater then x");
        }else{
            System.out.println("x is greater then y");
        }

        //example: 03
        int time = 20;
        if(time < 18){
            System.out.println("Good morning");
        }else{
            System.out.println("Good Evening");
        }
        
    }
}
