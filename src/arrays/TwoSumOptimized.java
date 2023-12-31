package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumOptimized {

    public static void main(String[] args) {
        int nums[] = {15, 2, 11, 7};
        int target = 9;
        int result[] = getResult(nums, target);
        System.out.println("Two sum result : " + Arrays.toString(result));
    }

    private static int[] getResult(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
