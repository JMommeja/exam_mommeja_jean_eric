package kata;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BallTest {

    @Test
    public void itRollsForAGivenAmountOfTime() throws Exception {
        Ball ball = new Ball(20000);
        //verif si y'a l'exeption
        Assertions.assertThat(ball.roll()).isEmpty();
    }
}
