package Function;

import java.util.Scanner;

public class AtA {

    public static int getValueinBase(int n,int b1,int b2){
        int rv=0;
        int p=1;
        int dig;
        if(b2==10){
            while(n>0){
                dig=n%10;
                n=n/10;

                rv+=dig*p;
                p=p*b1;
             }
        }else if(b2==8||b2==2){
            while(n>0){
                dig=n%b2;
                n=n/b2;
                rv+=dig*p;
                p=p*10;
            }
        }else{
            rv=0;
        }
        return rv;
        
    }
    public static void main(String[] args){
        System.out.print("Enter two NO");
        Scanner scn= new Scanner(System.in);
        int num1= scn.nextInt();
        int num2= scn.nextInt();
        int num3= scn.nextInt();
        scn.close();
        int p=getValueinBase(num1, num2,num3);
        System.out.print("ans is"+p);
    }
    
}
