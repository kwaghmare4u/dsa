package arrays;

public class MaximumNumberInAnArray {

    private static int getMaximumNumber(int[] arr) {
        int max = 0;
        for (int x : arr) {
            if (x > max)
                max = x;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] inputData = {2, 10, 0, 100, 99, 1000};
        System.out.println("Max number in the input array is : " + getMaximumNumber(inputData));
    }
}
