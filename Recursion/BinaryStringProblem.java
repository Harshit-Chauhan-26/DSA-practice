public class BinaryStringProblem {
    public static void function(int n, int lastPlace, String str) {
       // BASE CASE
       
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // better kaam
        function(n - 1, 0, str+"0");
        if (lastPlace == 0) {
            function(n - 1, 1, str+"1");
        }
    }

    public static void main(String[] args) {
        function(9, 0, "");
    }
}
