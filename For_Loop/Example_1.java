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

            for(int y = 1; y<= 3; y++){ //inner-loop
                System.out.println(y);
            }
        }


        //example: 03
        String[] cars ={"Rolls", "Volvo", "BMW", "J-SEL"};
        for(String i : cars){
            System.out.println(i);
        }
            System.out.println("\n"); //Exaternal use;
            
        String[] mans = {"jiad", "joy", "limon", "sujon", "Sabbir", "Asif"};

        for(String x : mans){
            System.out.println(x);
        }
    }
}














