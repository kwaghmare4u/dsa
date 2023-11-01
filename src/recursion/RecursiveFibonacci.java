package recursion;

public class RecursiveFibonacci {

    public static int fibonacci(int data) {
        if (data <= 1)
            return data;
        return fibonacci(data - 1) + fibonacci(data - 2);
    }

    public static void main(String[] args) {
        int input = 10;
        for (int i = 0; i < input; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }

}
