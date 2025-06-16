//max -min
package Array;
import java.util.*;
public class span {

    public static int Span(int arr[]){
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<=arr[i]){
                max=arr[i];
            }
            if(min>=arr[i]){
                min=arr[i];
            }
        }
        int span= max-min;
        return span;
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
        int span = Span(arr);
        System.out.print(span);
    }
}
