import java.util.*;
public class disapperingno {
    
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n + 1];

        for (int num : nums) {
            seen[num] = true;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                result.add(i);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        
    }
}
