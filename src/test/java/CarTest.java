import org.junit.jupiter.api.Test;


public class CarTest {

    @Test
    void moveWhenCarIsClosedAndLightIsOn() {

        Car pride = new Car("pride");
        pride.carDorOpen();
        pride.carDorClose();
        pride.movingCar();
    }


    class Car{

        Car(){
            System.out.println("hello");
        }
        Car(String mark){
            this.mark = mark;
        }
        
        boolean isDorCarOpen;
        boolean isCarOn;
        String mark;

        //method

        void carIsOn(){
            System.out.println("car is On");
            isCarOn = true;
        }

        void carIsOof(){
            System.out.println("car is Off");
            isCarOn = false;
        }

        void carDorOpen(){
            System.out.println("dor is Open");
        }
        void carDorClose(){
            System.out.println("dor is Closes");
        }


        void movingCar(){
            if(!isDorCarOpen && isCarOn){
                System.out.println("the car can Move");
            }else{
                System.out.println("the car can't Move");
            }
        }
    }
}
