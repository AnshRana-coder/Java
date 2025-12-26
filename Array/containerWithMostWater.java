import java.util.Scanner;

public class containerWithMostWater {
    public static int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length-1;
        while(left<right){
            int area = Math.min(height[left],height[right]) * (right-left);
            if(area>max){
                max = area;
            }
            if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }
        }
        return max;
    }
    public static void main(String[] args){
        System.out.print("Enter an array size and it value");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        scn.close();
        int area = maxArea(arr);
        System.out.println(area);
            
    }
}
