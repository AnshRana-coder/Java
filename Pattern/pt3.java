package Pattern;
import java.util.*;
public class pt3 {
    public static void main(String[] args){
        System.out.print("ENter a no.");
        Scanner scn = new Scanner(System.in);
        int num= scn.nextInt();
        scn.close();
        for(int i=num;i>=1;i--){
            for(int j=1;j<=num;j++){
                if(j<=i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}
