import java.util.Arrays; // ascending order
import java.util.Collections; // descending order

public class InbuiltSort {
    public static void printArr(Integer arr[]) { // int for ascending order Integer for descending order
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 1, 3, 2 }; // int for ascending order Integer for descending order
        Arrays.sort(arr, 0, 3); // ascending order
        Arrays.sort(arr, Collections.reverseOrder()); // descending order
        printArr(arr);
    }
}
