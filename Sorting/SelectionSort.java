package Sorting;
import java.util.*;
public class SelectionSort {

     public static int[] SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
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
        SelectionSort(arr);
        display(arr);
        
    }
}
