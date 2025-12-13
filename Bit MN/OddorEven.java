public class OddorEven {
    public static void OoE(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        OoE(5);
        OoE(13);
        OoE(4);

    }
}
