import java.util.*;
public class spiralTraverse {

    public static void spiralTraverse(int[][] arr){
        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        int t=arr.length*arr[0].length;
        int count=0;
        while(count<t) {
            // left wall
            for(int i =minr, j= minc; i <=maxr && count<t; i++){ 
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;
            // bottom wall
            for(int i =maxr, j= minc; j<= maxc && count<t; j++){ 
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;
            // right wall
            for(int i =maxr, j =maxc; i>=minr && count<t; i--){ 
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;
            // top wall
            for(int i =minr, j =maxc; j>=minc && count<t; j--){ 
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;
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

        spiralTraverse(arr1);
    }
}
