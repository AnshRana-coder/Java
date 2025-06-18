import java.util.Scanner;

public class rotateby90 {
     public static void rotate(int[][] arr){
        //transpose
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
                
            }
        }
        for(int i=0;i<arr.length;i++){
            int left=0;
            int right=arr[0].length-1;
            while(left<right){
                int x=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=x;
                left++;
                right--;
                }

        }
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
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


        scn.close();

        rotate(arr1);
    }
}
