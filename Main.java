import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] s = { 1, 2, 3, 4, 4, 6, 6, 7, 9, 9, 13 };
        int[] f = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int n = s.length;

        System.out.println(Arrays.toString(guloso(s, f, n)));
    }

    private static int[] guloso(int[] s, int[] f, int n) {
        f[0] = Integer.MIN_VALUE;
        int[] x = new int[n];

        int i = 0;

        for (int k = 0; k < n; k++) {
            if (s[k] > f[i]) {
                x[k] = 1;
                i = k;
            }
        }

        return x;
    }
}