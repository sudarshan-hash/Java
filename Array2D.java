

 //---------------------------------- 2D Array -------------------------------------------

class array{
    public static void main(String[] args){
        int Array[][]=new int[3][4];
        System.out.println(" Size of row "+Array.length);    //row
        System.out.println(" Size of Column " +Array[0].length);    // Column

        Array[0][0]=12; Array[1][0]=13;Array[2][0]=14;                //Assign Value
        System.out.println(" Value of Array[1][0] "+Array[1][0]);    //Print Value

      // traversing an 2d array

         for (int i=0;i<Array.length;i++){
             for (int j=0;j<Array[0].length;j++){
                 System.out.print(Array[i][j]+" ");
             }
             System.out.println(" ");
         }
    }
}

 //---------------------------------- Crating an Jagged Array in java ----------------------


class array{
    public static void main(String[] args) {

        int Array[][]; // First Initialize
        Array=new int [4][]; // Assign the size of row
        Array[0]=new int[2];
        Array[1]=new int[10];
        Array[2]=new int[4];
        Array[3]=new int[7];

        for (int i=0;i<Array.length;i++){
            for (int j=0;j<Array[i].length;j++){
                System.out.print(Array[i][j]);
            }
            System.out.println(" ");
        }
    }
}

 //-------------------- Matrix Multiplication ----------------------------

public class array {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] B = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        // Dimensions of the matrices
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        // Resultant matrix
        int[][] C = new int[rowsA][colsB];

        // Matrix multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print the resulting matrix
        System.out.println("Resulting Matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
