package Pattern;
import java.util.*;
public class pt14 {
    public static void main(String[] args){
        System.out.print("Enter a NO");
        Scanner scn= new Scanner(System.in);
        int num= scn.nextInt();
        scn.close();
        for(int i=1;i<=10;i++){
            
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
}
