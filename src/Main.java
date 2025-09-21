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

        int [][] result = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }


        System.out.println(" After Multiplying matrix A and matrix B, we get: ");

        for(int i=0 ; i< 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}