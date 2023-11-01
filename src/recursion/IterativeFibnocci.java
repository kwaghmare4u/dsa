package recursion;

public class IterativeFibnocci {

    public static void getResult(int input) {
        int num1 = 0;
        int num2 = 1;
        int counter = 0;
        while (counter < input) {
            int num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
            counter++;
        }
    }

    public static void main(String[] args) {
        int input = 10;
        getResult(input);
    }
}
