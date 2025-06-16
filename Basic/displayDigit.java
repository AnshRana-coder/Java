package Basic;
import java.util.*;
public class displayDigit {
    public static void main (String[] args){
        System.out.print("enter a number: ");
        Scanner scn = new Scanner(System.in);
        int num= scn.nextInt();
        int x;
        scn.close();
        while(num>0){
            x=num%10; 
            num=num/10;
            System.out.println(x);
        }
        
    }
}
