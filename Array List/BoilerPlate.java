import java.util.ArrayList;

public class BoilerPlate {
    public static void main(String args[]) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // add element - O(1)
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println(list1.size());

        // print the arraylist
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();

        // list1.add(1, 9); // -- O(n)
        // System.out.println(list1);

        // Get Operation - O(1)
        // int element = list1.get(2);
        // System.out.println(element);

        // // Delete - O(n)
        // list1.remove(3);
        // System.out.println(list1);

        // Set
        // list1.set(3, 10);
        // System.out.println(list1);
        // }

        // contains
        // System.out.println(list1.contains(1));
        // System.out.println(list1.contains(11));
    }
}