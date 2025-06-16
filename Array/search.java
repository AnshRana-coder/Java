//find
package Array;
import java.util.*;
public class search {

    public static int Span(int arr[],int x){
        int z=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                z=i;
            }
        }
        return z;
    }
    public static void main(String[] args){
        System.out.print("Enter an array size and it value and the element to find");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int num2=scn.nextInt();
        scn.close();
        int span = Span(arr,num2);
        System.out.print(span);
    }
}
