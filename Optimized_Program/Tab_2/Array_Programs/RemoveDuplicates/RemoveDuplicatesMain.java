package Optimized_Program.Tab_2.Array_Programs.RemoveDuplicates;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesMain {

    public static void main(String[] args) {

        // Create list with duplicates
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);

        System.out.println("Original List: " + list);

        // Remove duplicates
        List<Integer> result = RemoveDuplicates.removeDuplicates(list);

        System.out.println("List without duplicates: " + result);
    }
}
