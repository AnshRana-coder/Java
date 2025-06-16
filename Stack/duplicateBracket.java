package Stack;

import java.util.*;
public class duplicateBracket {
    public static void main(String[] args){
        
        System.out.print("Enter the expression");
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();
        Stack <Character> st=new Stack<>();
        if(str.length()==0){
            System.out.print("Empty Stack");
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
           
            if(ch==')'){
                if(st.peek()=='('){
                    System.out.print(true);
                    return;
                }
                else{
                    while(st.peek()!='('){
                        st.pop();
                    }
                    st.pop();
                }
            }else{
                st.push(ch);
            }
        }
        System.out.print(false);
    }
}

