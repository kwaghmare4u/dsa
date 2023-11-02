package arrays;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int input[] = {-4, -1, 0, 3, 10};
        squaresOfSortedArray(input);
    }

    private static void squaresOfSortedArray(int[] input) {
        int size = input.length;
        int result[] = new int[size];
        int i = 0, j = size - 1;
        for (int k = size - 1; k >= 0; k--) {
            if (Math.abs(input[i]) > Math.abs(input[j])) {
                result[k] = input[i] * input[i];
                i++;
            } else {
                result[k] = input[j] * input[j];
                j--;
            }
        }
        System.out.println("Result : " + Arrays.toString(result));
    }

    /*private static void squaresOfSortedArray(int[] input) {
        int i = 0;
        for (int num : input){
            input[i++] = num * num;
        }
        Arrays.sort(input);
        System.out.println("Result : " +Arrays.toString(input));
    }*/


}
