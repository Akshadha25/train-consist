import UC8_FilterBogiesStream.Main;
import UC8_FilterBogiesStream.Main.Bogie;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UC8Test {

    @Test
    void testFilterBogies() {

        Main obj = new Main();

        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 60),
                new Bogie("First Class", 40)
        );

        List<Bogie> result = obj.filterBogies(bogies);

        assertEquals(1, result.size());
    }
}
