package arrays;

public class CheckDuplicateInAnArray {

    private static boolean isDuplicateValuePresent(int[] arr) {
        for (int i= 0; i< arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] inputData = {12, 35, 1, 10, 34, 1 };
        System.out.println("Is duplicate value present : " + isDuplicateValuePresent(inputData));
    }
}
