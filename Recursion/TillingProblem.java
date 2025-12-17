public class TillingProblem {
    public static int function(int n) { // 2xn (floor size)
        // 1.Base Case
        if (n == 0 || n == 1) {
            return 1;
        }

        // 2.kaam
        // vertical choice
        int fnm1 = function(n - 1);
        // horizontal choice
        int fnm2 = function(n - 2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static void main(String[] args) {
System.out.println(function(4));
    }
}
