package arrays;

import java.util.Arrays;

public class MoveZerosToEndOfAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        System.out.println("Result after moving 0s to end :"+ Arrays.toString(getResult(arr)));
    }

    private static int[] getResult(int[] arr) {
        int i=arr.length;
        int j=0;
        for (int x=0;x<arr.length;x++){
            if (arr[x]!=0){
                swap(arr ,j , x);
                j++;
            }
        }
        return arr;
    }

    public static void swap(int[] data, int a, int b)
    {
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }
}
