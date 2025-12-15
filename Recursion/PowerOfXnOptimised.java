public class PowerOfXnOptimised {

    public static int func(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int halfPower = func(x, n / 2);
        int halfPowerSq = halfPower * halfPower;
        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(func(x, n));
    }
}
