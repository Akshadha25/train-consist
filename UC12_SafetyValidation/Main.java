import java.util.ArrayList;
import java.util.List;

// Goods Bogie class
class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String toString() {
        return type + " (" + cargo + ")";
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Step 2: Validate safety rules
        boolean isSafe = bogies.stream().allMatch(b -> 
            (b.type.equals("Cylindrical") && b.cargo.equals("Petroleum")) 
            || (!b.type.equals("Cylindrical"))
        );

        // Step 3: Display result
        System.out.println("\nTrain Safety Status:");
        if (isSafe) {
            System.out.println("✔ Train is SAFE for operation.");
        } else {
            System.out.println("✘ Train is NOT SAFE!");
        }

        System.out.println("\nProgram continues...");
    }
}
