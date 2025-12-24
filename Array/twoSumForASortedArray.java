import java.util.Scanner;

public class twoSumForASortedArray {

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1}; 
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int num = scn.nextInt();

        int[] arr = new int[num];
        System.out.println("Enter array elements (sorted):");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.print("Enter target: ");
        int target = scn.nextInt();

        int[] result = twoSum(arr, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);

        scn.close();
    }
}
