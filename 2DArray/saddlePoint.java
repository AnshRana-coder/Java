import java.util.Scanner;

public class saddlePoint {
    public static void saddlePoint(int[][] arr){
        for(int i=0;i<arr.length;i++){
            int svj=0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]<arr[i][svj]){
                    svj=j;
                }
            }
            boolean flag=true;
            for(int k=0;k<arr.length;k++){
                if(arr[k][svj]>arr[i][svj]){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                System.out.print(arr[i][svj]);
                return;
            }
        }
        System.out.print("invalid inpuy");
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

        saddlePoint(arr1);
    }
}
