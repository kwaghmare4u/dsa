package arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 4, 5};
        int arr2[] = {2, 4, 6, 8};
        merge(arr1, arr2);
    }

    private static void merge(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int m =  arr1.length;
        int n =  arr2.length;
        int arr3[] = new int[ m + n];
        while (i < m && j < n){
            if (arr1[i] < arr2[j]){
                arr3[k++] = arr1[i++];
            }else {
                arr3[k++] = arr2[j++];
            }
        }
        while (i < m){
            arr3[k++] = arr1[i++];
        }
        while (j < n){
            arr3[k++] = arr2[j++];
        }
        System.out.println("Sorted array : " + Arrays.toString(arr3) );
    }

    /*private static void merge(int[] arr1, int[] arr2) {
        int result[] = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }*/


}
