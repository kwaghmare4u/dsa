package arrays;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int nums[] = {2, 15, 11, 7};
        int target = 9;
        int result[] = getResult(nums, target);
        System.out.println("Two sum result : " + Arrays.toString(result));
    }

    private static int[] getResult(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
