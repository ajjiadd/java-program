package break_continue;

public class Example {
    public static void main(String[] args){

        // Break - For-Loop

        for(int i = 0; i < 10; i++){
            if(i == 6){
                break;
            }
            System.out.println(i);
        }


        System.out.println("\n"); //External 

        //Continue - For-Loop
        
        for(int x = 0; x < 20; x++){
            if(x == 16){
                continue;
            }
            System.out.println(x);
        }

        
        System.out.println("\n"); //External 
        //Break  in While Loop

        int p = 0;
        while(p < 11){
            System.out.println(p);
            p++;

            if(p == 6){
                break;
            }
        }


        System.out.println("\n"); //External 
        // Continue in While Loop

        int q = 0;
        while(q < 15){
            System.out.println(q);
            q = q+2;

            
            if (q==10){
                continue;
            }
        }
    }
}
