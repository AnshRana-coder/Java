

import java.util.Scanner;

public class ceilandfloor {
    public static void ceilandfloor(int arr[],int k){
        int ceil=Integer.MAX_VALUE;;
        int floor=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
               ceil=k;
               floor=k;
               System.out.print(ceil+floor);
               break;
            }else if(arr[i]>k&&arr[i]<ceil){
                ceil=arr[i];
            }else if(arr[i]<k&&arr[i]>floor){
                floor=arr[i];
            }
        }
        if (floor == Integer.MIN_VALUE) {
            System.out.println("No floor exists for " + k);
        } else {
            System.out.println("Floor = " + floor);
        }

        if (ceil == Integer.MAX_VALUE) {
            System.out.println("No ceil exists for " + k);
        } else {
            System.out.println("Ceil = " + ceil);
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
        System.out.print("Enter the no to find ceil and floor of");
        int k=scn.nextInt();
        scn.close();
        ceilandfloor(arr,k);
        
    }
}
