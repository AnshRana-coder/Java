import java.util.*;
public class exitPoint {

    public static void exitpoint(int[][] arr){
        int dir =0;
        int i=0;
        int j=0;
        while(true) {
            dir=(dir+arr[i][j])%4;
            if(dir==0){
                j++;
            }else if(dir==1){
                i++;
            }else if(dir==2){
                j--;
            }else if(dir==3){
                i--;
            }
            if(i<0){
                i++;
                break;
            }else if(j<0){
                j++;
                break;
            }else if(i==arr.length){
                i--;
                break;
            }else if(j==arr[0].length){
                j--;
                break;
            }
        }
        System.out.println("Exit point is at: " + i + ", " + j);
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

        exitpoint(arr1);
    }
}
