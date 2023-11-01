package recursion;

public class Print1To100WithoutLoop {
    private static int counter = 1;

    public static void main(String[] args) {
        if (counter > 100) {
            return;
        }
        System.out.println("Counter : " + counter++);
        main(null);
    }
}
