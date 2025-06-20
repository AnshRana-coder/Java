
import java.util.*;
public class palindrom {

    public static void palsub(String str){
        for(int i=0;i<=str.length()-1;i++){
            for(int j=i;j<=str.length()-1;j++){
                String s = str.substring(i,j+1);
                if(s.length()>1&&ispalindrom(s)){
                    System.out.println(s);
                }               
            }
        }
    }
    public static boolean ispalindrom(String str){
        int left=0;
        int right=str.length()-1;
       
        while(left<right){
            if(str.charAt(left)==str.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.print("ENter a string");
        Scanner scn = new Scanner(System.in);
        String str  = scn.nextLine();
        scn.close();
        palsub(str);
    }
}
