//rev
package Array;
import java.util.*;
public class inverse {

    public static void inverse(int arr[]){
        int[] inv = new int [arr.length];
        int x;
        for(int i=0;i<arr.length;i++){
            x=arr[i];
            inv[x]=i;
        }
        for(int i=0;i<inv.length;i++){
            System.out.print(inv[i]+" ");
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
        inverse(arr);
        
    }
}
