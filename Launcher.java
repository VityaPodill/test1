public class Launcher {
    public static void main(String[] args) {
        String c = "qwerty uio asdfg hjkl", d = "o a";
        int lc = c.length(), ld = d.length();
        for (int i = 0; i <= lc - ld; i++) {
            if (c.substring(i, i + ld).equals(d)) {
                System.out.println("YES 111");
                break;
            } else if (i == lc - ld) System.out.println("N0");
            //-----------------------
        }
    }
}
