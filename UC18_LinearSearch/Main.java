public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG150", "BG310", "BG999"};

        String searchKey = "BG150"; // change this to test

        boolean found = false;

        // Step 2: Linear Search
        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(searchKey)) {
                System.out.println("\nBogie Found at index: " + i);
                found = true;
                break; // early termination
            }
        }

        // Step 3: Result
        if (!found) {
            System.out.println("\nBogie NOT Found");
        }

        System.out.println("\nProgram continues...");
    }
}
