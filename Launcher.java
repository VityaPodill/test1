import java.util.HashMap;
import java.util.Map;

public class Launcher {
    public static void main(String[] args) {
        String a = "r ray uio1asdfghjk12345qwerty1111",
                b = "qwerty";
        int la = a.length(), lb = b.length();
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < lb - 1; i++)
            m.put(b.charAt(i), i + 1);
        //-------------------------------------------------
        w:
        for (int i = 0; i <= la - lb; i++) {
            for (int k = lb - 1; k >= 0; k--) {
                if (b.charAt(k) == a.charAt(i + k)) {
                    if (k == 0) {
                        System.out.println(i);
                        break w;
                    }
                } else {
                    if (m.containsKey(a.charAt(i + k))) {
                        i += k - m.get(a.charAt(i + k));
                        break;
                    } else {
                        i += k;
                        break;
                    }
                }
            }
            if (i == la - lb) System.out.println("EMPTY");
        }
    }
}