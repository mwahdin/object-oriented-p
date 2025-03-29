package mover;

public class Motor extends mover{

        public boolean isRunning() {
        if (isOn) {
            System.out.println("is on");
            return true;
        }else{
            System.out.println("is off");
            return false;
        }
    }
}
