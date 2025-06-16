package Pattern;
import java.util.*;
public class pt2 {
    public static void main(String[] args){
        System.out.print("Enter a no:");
        Scanner scn=new Scanner(System.in);
        int num= scn.nextInt();
        scn.close();
        for(int i=num;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
