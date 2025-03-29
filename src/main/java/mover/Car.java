package mover;

import static java.lang.System.out;

public class Car extends mover implements Gearbox, HaveBox {

        Car(){
            out.println("hello");
        }
        public Car(String mark){
            this.mark = mark;
        }

        boolean isDorOpen;
        String mark;

        //methods

        void dorOpen(){
            out.println("dor is Open");
        }
        void DorClose(){
            out.println("dor is Closes");
        }


        public boolean isRunning(){
            if(!isDorOpen && isOn){
                out.println("can Move");
                return true;
            }else{
                out.println("can't Move");
                return false;
            }
        }

    @Override
    public String GearboxType() {
        return "automatic";
    }

    @Override
    public int BoxCapacity() {
        return 100;
    }
}
