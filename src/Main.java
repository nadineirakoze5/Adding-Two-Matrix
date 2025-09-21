import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int [][] matrixA = { {3,5},
                             {5,6}
        };

        int [][] matrixB = { {2,5},
                             {7,4}
        };

        System.out.println(" Matrix A");

            for(int i=0 ; i< 2; i++){
            for(int j=0; j< 2; j++){

                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(" Matrix B");

        for(int i=0 ; i< 2; i++){
            for(int j=0; j< 2; j++){
                System.out.print(matrixB[i][j] + " ");
            }
            System.out.println();
        }


        /*
        int a= matrixA[0][0] * matrixB[0][0] + matrixA[0][1] * matrixB[1][0];
        int b= matrixA[0][0] * matrixB[0][1] + matrixA[0][1] * matrixB[1][1];
        int c= matrixA[1][0] * matrixB[0][0] + matrixA[1][1] * matrixB[1][0];
        int d= matrixA[1][0] * matrixB[0][1] + matrixA[1][1] * matrixB[1][1];
        That's for Multiplying Two Matrix
        */

        int a = matrixA[0][0] + matrixB[0][0];
        int b = matrixA[0][1] + matrixB[0][1];
        int c = matrixA[1][0] + matrixB[1][0];
        int d = matrixA[1][1] + matrixB[1][1];

        int [][] result = { {a,b},
                {c,d}
        };

        System.out.println(" After Adding matrix A and matrix B, we get: ");

        for(int i=0 ; i< 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}