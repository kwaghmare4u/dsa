package arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int input[] = {1, 2, 0, 4, 3, 0, 5, 0};
        moveZeros(input);
    }

    private static void moveZeros(int[] input) {
        int count = 0;
        for (int i : input) {
            if (i != 0) {
                input[count++] = i;
            }
        }
        while (count < input.length) {
            input[count++] = 0;
        }
        System.out.println("Result : " + Arrays.toString(input));
    }
}
