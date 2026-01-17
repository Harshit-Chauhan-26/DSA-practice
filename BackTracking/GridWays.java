public class GridWays {
    public static int gridw(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) { // condition for last cell
            return 1;
        } else if (i == n || j == n) { // boundary cross condition
            return 0;
        }

        int W1 = gridw(i + 1, j, n, m);
        int W2 = gridw(i, j + 1, n, m);
        return W1 + W2;
    }

    public static void main(String args[]) {
        int n = 3, m = 3;
        System.out.println(gridw(0, 0, n, m));
    }
}
