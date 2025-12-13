public class SetithBit {
    public static int setith(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(setith(10, 2));
    }
}
