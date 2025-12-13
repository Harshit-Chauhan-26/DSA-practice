public class UpdateithBit {
    public static int setith(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearith(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateith(int n, int i, int newBit) {
        // 1st LOGIC
        // if(newBit == 0) {
        // return clearith(n, i);
        // } else {
        // return setith(n, i);
        // }

        // 2nd LOGIC
        n = clearith(n, i);
        int BitMask = newBit << i;
        return n | BitMask;
    }

    public static void main(String[] args) {
System.out.println(updateith(10, 2, 1));
    }
}
