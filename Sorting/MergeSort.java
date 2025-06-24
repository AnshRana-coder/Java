package Sorting;
import java.util.*;
public class MergeSort {

    public static int[] MergeSort(int[] arr,int low,int high){

        if(low==high){
            int[] fll = new int[1];
            fll[0] = arr[low];
            return fll;
        }
        int mid=(low+high)/2;
        int[] first = MergeSort(arr,low,mid);
        int[] second = MergeSort(arr,mid+1,high);
        int[] full =MergeTwoSorted(first, second);

        return full;
    }
    public static int[] MergeTwoSorted(int [] arr,int [] arr2){
        int[] arr3=new int[arr.length+arr2.length];
        int k=0;
        int i=0;
        int j=0;
        while(i<arr.length && j<arr2.length){
            if(arr[i]<arr2[j]){
                arr3[k]=arr[i];
                i++;
            }else{
                arr3[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i < arr.length){
            arr3[k++] = arr[i++];
        }
        while(j < arr2.length){
            arr3[k++] = arr2[j++];
        }
        return arr3;
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

        int[] arr3 = MergeSort(arr,0,arr.length-1);
        display(arr3);
        
    }
}
