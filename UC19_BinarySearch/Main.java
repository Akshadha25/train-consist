import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create and SORT array
        String[] bogieIds = {"BG101", "BG205", "BG150", "BG310", "BG999"};
        Arrays.sort(bogieIds); // Important for binary search

        System.out.println("\nSorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        String key = "BG150"; // change to test

        // Step 2: Binary Search
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = bogieIds[mid].compareTo(key);

            if (comparison == 0) {
                System.out.println("\nBogie Found at index: " + mid);
                found = true;
                break;
            } else if (comparison < 0) {
                low = mid + 1; // search right
            } else {
                high = mid - 1; // search left
            }
        }

        // Step 3: Result
        if (!found) {
            System.out.println("\nBogie NOT Found");
        }

        System.out.println("\nProgram continues...");
    }
}
