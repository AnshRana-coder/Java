import java.util.*;
public class waveTraverse {

    public static void waveTraverse(int[][] arr){
        for(int j=0;j<arr[0].length;j++){
            if(j%2==0){
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i][j] +" ");
                }
            }else{
                for(int i=arr.length-1;i>=0;i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
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


        scn.close();

        waveTraverse(arr1);
    }
}
