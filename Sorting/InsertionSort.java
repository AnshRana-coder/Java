package Sorting;
import java.util.*;
public class InsertionSort {

    public static int[] InsertionSort(int [] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }else{
                    break;
                }          
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void display(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of an array");
        int n = scn.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter the next element");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        scn.close();
        InsertionSort(arr);
        display(arr);
        
        
    }
}
