package Optimized_Program.Tab_2.Array_Programs.RemoveDuplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

    /**
     * Removes duplicate elements from a list.
     *
     * Logic:
     * - Convert List to Set → removes duplicates
     * - Convert Set back to List
     *
     * @param list input list
     * @return list without duplicates
     */
    public static List<Integer> removeDuplicates(List<Integer> list) {

        // Edge case: null or empty list
        if (list == null || list.isEmpty()) {
            return new ArrayList<>();
        }

        // Convert List → Set (duplicates removed automatically)
        Set<Integer> set = new HashSet<>(list);

        // Convert Set → List
        return new ArrayList<>(set);
    }
}
