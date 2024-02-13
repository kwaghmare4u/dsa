package arrays;

public class SecondMaximumNumberInAnArray {

    private static int getSecondMaximumNumber(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > max) {
                secondMax = max;
                max= x;
            }else if (x < max && x> secondMax){
                secondMax = x;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] inputData = {12, 35, 1, 10, 34, 1 };
        System.out.println("Second max number in the input array is : " + getSecondMaximumNumber(inputData));
    }
}
