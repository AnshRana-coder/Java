import java.util.Scanner;

public class shellRotate {
    public static void shellRotate(int[][] arr,int s,int r){
       int[] oned = fillOnedFromShell(arr,s);
       rotate(oned,r);
       fillShellFromOned(arr,s,oned);
    }
    public static int[] fillOnedFromShell(int[][] arr,int s){
        int minr=s-1;
        int minc=s-1;
        int maxr=arr.length-s;
        int maxc=arr[0].length-s;
        int sz=2*(maxr-minr+1) + 2*(maxc-minc+1) -4;
        int[] oned = new int[sz];
        //lw
        int idx=0;
        for(int i=minr,j=minc;i<=maxr;i++){
            oned[idx]=arr[i][j];
            idx++;
        }
        //bw
        for(int i=maxr,j=minc+1;j<=maxc;j++){
            oned[idx]=arr[i][j];
            idx++;
        }
        //rw
        for(int i=maxr-1,j=maxc;i>=minr;i--){
            oned[idx]=arr[i][j];
            idx++;
        }
        //tw
        for(int i=minr,j=maxc-1;j>=minc+1;j--){
            oned[idx]=arr[i][j];
            idx++;
        }
        return oned;

    }
    public static void fillShellFromOned(int[][] arr,int s,int[] oned){
        int minr=s-1;
        int minc=s-1;
        int maxr=arr.length-s;
        int maxc=arr[0].length-s;

        //lw
        int idx=0;
        for(int i=minr,j=minc;i<=maxr;i++){
            arr[i][j]=oned[idx];
            idx++;
        }
        //bw
        for(int i=maxr,j=minc+1;j<=maxc;j++){
            arr[i][j]=oned[idx];
            idx++;
        }
        //rw
        for(int i=maxr-1,j=maxc;i>=minr;i--){
            arr[i][j]=oned[idx];
            idx++;
        }
        //tw
        for(int i=minr,j=maxc-1;j>=minc+1;j--){
            arr[i][j]=oned[idx];
            idx++;
        }
        
    }
    public static void rotate(int arr[],int k){
        k=k%arr.length;
        if(k<0){
            k=k+arr.length;
        }
      //part1
        reverse(arr,0,arr.length-k-1);
      //part2
        reverse(arr,arr.length-k,arr.length-1);
      //whole
        reverse(arr, 0, arr.length-1);
    }
    public static void reverse(int arr[],int i , int j){
        int left=i;
        int right=j;
        int x=0;
        while(left<right){
            x=arr[left];
            arr[left]=arr[right];
            arr[right]=x;
            left++;
            right--;
        }
    }
    public static void display(int[][] arr){
        int r1=arr.length;
        int c1=arr[0].length;
        for(int i=0; i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(arr[i][j]+" ");
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
        System.out.println("Enter s and r");
        int s=scn.nextInt();
        int r=scn.nextInt();


        scn.close();
        

        shellRotate(arr1,s,r);
        display(arr1);
    }
}
