package LeetCode;

import java.util.Arrays;

public class Problem66 {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};
        int[] digits2 = {4, 3, 2, 1};
        int[] digits3 = {9};

        System.out.println(Arrays.toString(plusOne(digits1))); 
        System.out.println(Arrays.toString(plusOne(digits2))); 
        System.out.println(Arrays.toString(plusOne(digits3))); 
    }
}
