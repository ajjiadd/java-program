package For_Loop;

public class Example_1{
    public static void main(String[] args){
      
        //example: 01
      
        for(int i = 0; i <= 110; i = i+5){
            System.out.println(i);
        }
        
        System.out.println("\n"); // exaternal

        //example: 02
        //Nested Loops

        for(int x = 1; x <= 2; x++){ //out-loop
            System.out.println(x);

            for(int y = 1; y<= 3; y++){
                System.out.println(y);
            }
        }
    }
}