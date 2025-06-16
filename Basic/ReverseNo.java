package Basic;
import java.util.*;
public class ReverseNo {
   public static void main(String[] args){
        System.out.println("Enter a no:");
        Scanner scn= new Scanner(System.in);
        int num= scn.nextInt();
        scn.close();
        int x,y=0; 
        while(num>0){
            x=num%10; 
            num=num/10;
            y=y*10+x;
            
        }
        System.out.println(y);
   } 
}
