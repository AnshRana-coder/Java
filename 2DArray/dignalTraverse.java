import java.util.Scanner;

public class dignalTraverse {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0 ;i < arr.length; i++){
            for(int j = 0 ;j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();
        for(int g = 0 ;g< arr.length; g++){
            for(int i = 0 ,j=g; j < arr.length; i++, j++){
                System.out.print(arr[i][j]+" ");
            }
            
        }
    }
}
