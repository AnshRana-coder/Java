package Stack;
import java.util.*;


public class balancedBracket {
    public static void main(String[] args){
        System.out.print("Enter the expression: ");
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }

            // Closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (st.isEmpty()) {
                    System.out.println(false);
                    return;
                }
                char top = st.pop();
                if (!isMatching(top, ch)) {
                    System.out.println(false);
                    return;
                }
            }
        }

        // If stack is empty, brackets are balanced
        System.out.println(st.isEmpty());
    }

    public static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
