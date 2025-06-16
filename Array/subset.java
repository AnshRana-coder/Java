//rev
package Array;
import java.util.*;
public class subset{

    public static void subset(int arr[]){
        
        for(int i=0; i<arr.length;i++){
            

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
        subset(arr);
        
    }
}
