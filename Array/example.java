package Array;

public class example {
    public static void main(String[] args){

        //Change an Array Element

        String[] cars = {"j-sl", "volvo", "BMW", "Rolls"};
        cars[1] = "Tesla";
        System.out.println(cars[1]);

        //how show length in array?
        System.out.println(cars.length);

        //For Loop in array
        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }

        System.out.println("\n"); //external

        //For-Each Loop in array
        for (String x : cars){
            System.out.println(x);
        }

        //Number in array:
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(number[4]);
        
        

    }
}
