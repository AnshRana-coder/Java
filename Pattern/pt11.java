package Pattern;
import java.util.*;
public class pt11 {
    public static void main(String[] args){
        System.out.print("Enter a NO");
        Scanner scn= new Scanner(System.in);
        int num= scn.nextInt();
        scn.close();
        int sum=0;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j<=i){
                    sum++;
                    System.out.print(sum);
                }
            }
            System.out.println();
        }
    }
}
