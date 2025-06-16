package Function;

import java.util.Scanner;

public class digitFreq {
    public static int digitFreq(int x,int y){
        int temp;
        int z=0;
        while(x>0){
            temp=x%10;
            if(temp==y){
                z++;
            }
            x=x/10;
        }
        return z;
    }
    public static void main(String[] args){
        System.out.print("Enter two NO");
        Scanner scn= new Scanner(System.in);
        int num1= scn.nextInt();
        int num2= scn.nextInt();
        scn.close();
        int p=digitFreq(num1, num2);
        System.out.print("freq is"+p);
        

    }
}
