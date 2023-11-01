package recursion;

public class Power {
    public static void main(String[] args) {
        int number = 5;
        int x = 3;
        System.out.println(power(number ,x));
    }

    private static int power(int num, int x) {
        if (x == 0)
            return 1;

        return num * power(num, x-1);
    }
}
