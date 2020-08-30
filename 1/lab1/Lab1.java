public class Lab1 {
    public static void main(final String[] args) {
        char s = 0, n = 100, m = 100;
        for (char a = 0; a <= n; a++) {
            for (char b = 0; b <= m; b++) {
                s += (a - b) / (a + 1);
            }
        }
        System.out.println(s);
    }
}