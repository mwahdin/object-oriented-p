import org.junit.jupiter.api.Test;

import static java.lang.System.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CarTest {

    @Test
    void moveWhenCarIsClosedAndLightIsOn() {

        //given
        Car benz = new Car("benz");
        Car bmw = new Car("BMW");

        //when
        boolean carRunning = benz.isCarRunning();
        bmw.carIsOn();
        boolean bmwIsMoving = bmw.isCarRunning();

        //then
        assertFalse(carRunning);
        assertTrue(bmwIsMoving);

//        Car pride = new Car("pride");
//        pride.carDorOpen();
//        pride.carDorClose();
//        pride.movingCar();
    }


    class Car{

        Car(){
            out.println("hello");
        }
        Car(String mark){
            this.mark = mark;
        }
        
        boolean isDorCarOpen;
        boolean isCarOn;
        String mark;

        //method

        void carIsOn(){
            out.println("car is On");
            isCarOn = true;
        }

        void carIsOof(){
            out.println("car is Off");
            isCarOn = false;
        }

        void carDorOpen(){
            out.println("dor is Open");
        }
        void carDorClose(){
            out.println("dor is Closes");
        }


        boolean isCarRunning(){
            if(!isDorCarOpen && isCarOn){
                out.println("the car can Move");
                return true;
            }else{
                out.println("the car can't Move");
                return false;
            }
        }
    }
}
