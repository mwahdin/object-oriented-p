import mover.Motor;
import mover.mover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class MotorTest {
    @Test
    void moveWhenMotorIsOn() {
        //Given
        mover motor = new Motor();

        //when
        boolean motorTuning = motor.isRunning();

        //then
        assertFalse(motorTuning);
    }
}
