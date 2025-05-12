public class swapbitwise {
    public static void main(String[] args) {
        int a = 3, b = 4;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        swapwise(a, b);
    }

    private static void swapwise(int a, int b) {
        System.out.println("swap " + a + " " + b);
    }
}
