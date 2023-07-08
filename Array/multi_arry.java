package Array;

public class multi_arry {
    public static void main(String[] args){
        //example:01
        int[][] ary = {{1, 2, 3, 4,},{5, 6, 7,}};
        System.out.println(ary[1][2]);

        //example:02
        int[][] xxx = new int[2][3];
        xxx[0][0] = 10;
        xxx[0][1] = 20;
        xxx[0][2] = 30;
        xxx[1][0] = 40;
        xxx[1][1] = 50;
        xxx[1][2] = 60;

        System.out.println(xxx[0][2]);

        System.out.println("\n"); //new line


        //example:03
        int[][] xxxx = new int[2][3];
        xxxx[0][0] = 60;
        xxxx[0][1] = 50;
        xxxx[0][2] = 40;
        xxxx[1][0] = 30;
        xxxx[1][1] = 20;
        xxxx[1][2] = 10;

        for(int row = 0; row < 2; row++){
            for (int col = 0; col < 3; col++){
                System.out.println(xxxx[row][col]);
            }
            System.out.println();
        }


        //example:04
        int[][] jerin = {{1, 2, 3, 4},{5, 6, 7}};

        for(int roww = 0;roww < 2; roww++){
            for(int coll = 0;coll < 4; coll++ ){
                System.out.println(jerin[roww][coll]);
            }
            System.out.println(); 
        }

        
    }
}
