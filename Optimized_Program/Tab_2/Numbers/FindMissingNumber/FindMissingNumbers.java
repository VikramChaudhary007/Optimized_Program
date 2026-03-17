package Optimized_Program.Tab_2.Numbers.FindMissingNumber;


import java.util.HashSet;
import java.util.Set;

/**
 * Utility class for finding missing numbers in a given range.
 */
public class FindMissingNumbers {

    /**
     * Finds missing numbers in the range 0 to 100 using HashSet.
     *
     * Logic:
     * - Store all input numbers in a HashSet
     * - Iterate from 0 to 100
     * - If number is NOT in set → it's missing
     *
     * Time Complexity: O(n + 100)
     * Space Complexity: O(n)
     *
     * @param arr input array of numbers
     * @return Set of missing numbers
     */
    public static Set<Integer> findMissing(int[] arr) {

        // HashSet to store unique input numbers
        HashSet<Integer> set = new HashSet<>();

        // Add all elements to the set
        for (int num : arr) {
            if (num >= 0 && num <= 100) { // validate range
                set.add(num);
            }
        }

        // Set to store missing numbers
        Set<Integer> missingNumbers = new HashSet<>();

        // Check numbers from 0 to 100
        for (int i = 0; i <= 100; i++) {

            // If number is not in set, it's missing
            if (!set.contains(i)) {
                missingNumbers.add(i);
            }
        }

        return missingNumbers;
    }
}