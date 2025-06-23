//rot

import java.util.*;
public class rotate {
    public static void main(String[] args){
        System.out.print("Enter an array size and it value and a no by which it rotates");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        
        int[] arr = new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        scn.close();
        rotate(arr,k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
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
}
