public class Launcher {
    public static void main(String[] args) {
        int a = 5, b = 3;
        System.out.println(add(a, b));
        minus(a, b);
        System.out.println(times(a, b));
        System.out.println(sub(a, b));
        System.out.println(max(a, b));

        System.out.println(a);
    }
    private static int add(int a, int b) {
        return a + b;
    }
// ---------------------------------------------
    private static void minus(int a, int b) {
        System.out.println(a - b);
    }

    private static int times(int a, int b) {
        return a * b;
    }

    private static int sub(int a, int b) {
        return a / b;
    }

    private static int max(int a, int b) {
        return Math.max(a, b);
    }
}
