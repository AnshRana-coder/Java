import java.util.*;
public class matrixMultiplication {

    public static void matrixProduct(int[][] arr1,int[][] arr2){

        int r1 = arr1.length;
        int r2 = arr2.length;

        int c1 = arr1[0].length;
        int c2 = arr2[0].length;

        if(c1!=r2){
            System.out.print("Invalid matrix");
            return;
        }

        int[][] prd = new int[r1][c2];

        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    prd[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }

        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(prd[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("ENter  rows and col and the 1st 2d array");
        
        int r1=scn.nextInt();
        int c1=scn.nextInt();
        int[][] arr1 = new int[r1][c1];

        System.out.println("Enter the values of 1st array");

        for(int i=0; i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=scn.nextInt();
            }
        }

        System.out.println("ENter  rows and col and the 2nd 2d array");

        int r2=scn.nextInt();
        int c2=scn.nextInt();
        int[][] arr2 = new int[r2][c2];

        System.out.println("Enter the values of 1st array");

        for(int i=0; i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]=scn.nextInt();
            }
        }

        scn.close();

        matrixProduct(arr1, arr2);
    }
}
