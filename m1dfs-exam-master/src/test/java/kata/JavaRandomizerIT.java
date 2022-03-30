package kata;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JavaRandomizerIT {


    @Test
    public void numbersAreNeverOutsideBoundsOf0And37() throws Exception {
        assertThat(JavaRandomizer.UPPERLIMIT_FOR_RANDOM_37).isGreaterThanOrEqualTo(0).isLessThanOrEqualTo(37);
    }

    @Test
    public void allNumbersOccur() throws Exception {
        for (int i = 0; i <= 47; i = i + 2) {
            assertThat(JavaRandomizer.UPPERLIMIT_FOR_RANDOM_37).isGreaterThanOrEqualTo(0).isLessThanOrEqualTo(37);
        }

    }
}
