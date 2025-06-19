import java.util.Scanner;

public class search {
    public static void search(int[][] arr, int x){
        
        for(int i =0,j=arr.length-1;i<arr.length&&j>0;){
            
                if(arr[i][j]==x){
                    System.out.print("FOunnd"+i+" "+ j);
                    return;
                }else if(arr[i][j]>x){
                    j--;
                }else{
                    i++;
                }
            
        }
        
        System.out.print("NOt found");

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("ENter  rows and col and the 1st 2d array");
        
        int r1=scn.nextInt();
        int c1=scn.nextInt();
        int[][] arr1 = new int[r1][c1];

        System.out.println("Enter the values of 1st array and the element to find");

        for(int i=0; i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=scn.nextInt();
            }
        }
        int x=scn.nextInt();

        scn.close();

        search(arr1,x);
    }
}
