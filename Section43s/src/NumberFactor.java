import java.util.ArrayList;

public class NumberFactor {


    public int waysToGetNTopDown(int n) {
        // TODO
        int[] values = new int[n + 1];
        return waysToGetNTopDown(n, values);
    }

    private int waysToGetNTopDown(int n, int[] values) {
        if (n >= 0 && n <= 2) {
            values[n] = 1;
            return values[n];
        }
        if (n == 3) {
            values[n] = 2;
            return values[n];
        } else {
            int recursive1 = waysToGetNTopDown(n - 4, values);
            int recursive2 = waysToGetNTopDown(n - 3, values);
            int recursive3 = waysToGetNTopDown(n - 1, values);

            values[n] = recursive1 + recursive2 + recursive3;
        }
        return values[n];
    }

    public int waysToGetNBottomUp(int n) {
        int[] values = new int[n + 1];
        return waysToGetNBottomUp(n, values);
    }

    private int waysToGetNBottomUp(int n, int[] values) {
        for (int i = 0; i <= n; i++) {
            if (i == 3) {
                values[i] = 2;
            } else {
                values[i] = 1;
            }
        }
        if (n <= 3) {
            return values[n];
        }
        for (int i = 4; i <= n; i++) {
            values[i] = values[i - 4] + values[i - 3] + values[i - 1];
        }
        return values[n];


    }
}

