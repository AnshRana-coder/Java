import java.util.*;

public class reverseString {

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        char temp;

        while (left < right) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter size of character array:");
        int num = scn.nextInt();

        char[] arr = new char[num];

        System.out.println("Enter characters:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.next().charAt(0);
        }

        reverseString(arr);

        System.out.println("Reversed string:");
        for (char c : arr) {
            System.out.print(c);
        }
    }
}
