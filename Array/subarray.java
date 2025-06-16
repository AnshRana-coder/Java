//rev
package Array;
import java.util.*;
public class subarray {

    public static void subarray(int arr[]){
        
        for(int i=0; i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                   System.out.print(arr[k]+" "); 
                }
                System.out.println(); 
            }

        }

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
        subarray(arr);
        
    }
}
