import mover.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CarTest {

    @Test
    void moveWhenCarIsClosedAndLightIsOn() {

        //given
        Car benz = new Car("benz");
        Car bmw = new Car("BMW");


        //when
        boolean benzRunning = benz.isRunning();
        bmw.moverIsOn();
        boolean bmwIsMoving = bmw.isRunning();

        //then
        assertFalse(benzRunning);
        assertTrue(bmwIsMoving);

    }



}
