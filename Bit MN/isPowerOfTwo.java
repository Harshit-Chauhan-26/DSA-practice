public class isPowerOfTwo {
    public static boolean PowerOftwo(int n) {
        return (n&(n-1)) == 0;
    } 
    public static void main(String[] args) {
        System.out.println(PowerOftwo(2));
    }
    
}
