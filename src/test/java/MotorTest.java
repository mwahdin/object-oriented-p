import mover.Motor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class MotorTest {
    @Test
    void moveWhenMotorIsOn() {
        //Given
        Motor motor = new Motor();

        //when
        boolean motorTuning = motor.isRunning();

        //then
        assertFalse(motorTuning);
    }
}
