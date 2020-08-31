public class Lab1 {
    public static void main(final String[] args) {
        char s = 0, i, j, a = 0 , b = 0, n = 100, m = 100;
        if(a==65535 || b==65535 || n==65535 || m==65535)
        {System.out.println("can not find char");System. exit(0);}
        for (i=a ; i <= n; i++) {
            for (j=b ; j <= m; j++) {
                s += (i - j) / (i + 1);
            }
        }
        System.out.println(s);
    }
}
