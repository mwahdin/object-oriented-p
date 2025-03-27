import static java.lang.System.out;

public class Car {

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
