public class FriendPairingProblem {
    public static int function(int n) {
        // base case
        if (n == 1 || n == 2) {
            return n;
        }

        // Choices
        // single
        // int fnm1 = function(n - 1);

        // // pair
        // int fnm2 = function(n - 2);
        // int pairways = (n - 1) * fnm2;

        // // totalways
        // int totalways = pairways + fnm1;
        // return totalways;

        // SINGLE RETURN STATEMENT 
        return function(n - 1) + (n - 1) * function(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(function(9));
    }
}
