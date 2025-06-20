
import java.util.*;
public class compression{

    public static void compression(StringBuilder str){
        int count=1;
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr==prev){
                count ++;
            }else{
                if(count>1){
                    sb.append(count);
                    count=1;
                }
                sb.append(curr);
            }
        }
        System.out.print(sb);
    }
    
    public static void main(String[] args){
        System.out.print("ENter a string");
        Scanner scn = new Scanner(System.in);
        String str  = scn.nextLine();
        StringBuilder strr = new StringBuilder(str);
        scn.close();
        compression(strr);
    }
}
