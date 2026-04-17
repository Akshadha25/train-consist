import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Sample inputs (you can later replace with Scanner input)
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Step 1: Define regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Step 2: Compile patterns
        Pattern p1 = Pattern.compile(trainPattern);
        Pattern p2 = Pattern.compile(cargoPattern);

        // Step 3: Match inputs
        Matcher m1 = p1.matcher(trainId);
        Matcher m2 = p2.matcher(cargoCode);

        // Step 4: Validate
        System.out.println("\nTrain ID Validation:");
        if (m1.matches()) {
            System.out.println(trainId + " is VALID");
        } else {
            System.out.println(trainId + " is INVALID");
        }

        System.out.println("\nCargo Code Validation:");
        if (m2.matches()) {
            System.out.println(cargoCode + " is VALID");
        } else {
            System.out.println(cargoCode + " is INVALID");
        }

        System.out.println("\nProgram continues...");
    }
}
