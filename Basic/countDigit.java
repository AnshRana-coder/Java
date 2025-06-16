package Basic;
import java.util.*;
public class countDigit {
    public static void main (String[] args){
        System.out.print("enter a number: ");
        Scanner scn = new Scanner(System.in);
        int num= scn.nextInt();
        scn.close();
        int i=0;
        while(num>0){
            num=num/10;
            i++;
        }
        System.out.print("no of digits is: "+i);
    }
}
