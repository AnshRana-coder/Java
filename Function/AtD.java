package Function;

import java.util.Scanner;

public class AtD {

    public static int getValueinBase(int n,int b){
        int rv=0;
        int p=1;
        int dig;
        while(n>0){
            dig=n%10;
            n=n/10;

            rv+=dig*p;
            p=p*b;
        }
        return rv;
    }
    public static void main(String[] args){
        System.out.print("Enter two NO");
        Scanner scn= new Scanner(System.in);
        int num1= scn.nextInt();
        int num2= scn.nextInt();
        scn.close();
        int p=getValueinBase(num1, num2);
        System.out.print("ans is"+p);
    }
    
}
