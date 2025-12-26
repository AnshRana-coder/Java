import java.util.Scanner;

public class concatination {
    public static int[] getConcatenation(int[] nums) {
        int n  = nums.length;
        int j = 0;
        int [] arr = new int[2*n];
        for(int i = 0;i<=2*n-1;i++){
            if(i<n){
                arr[i] = nums[i];
            }else{
                arr[i] = nums[j];
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        System.out.print("Enter an array size and it value");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        scn.close();
        int[] x = getConcatenation(arr);
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+ " ");
        }   
    }
}
