package mover;

public class Motor {

    boolean isOn;

    void motorIsOn(){
        isOn = true;
    }

    void motorIsOff(){
        isOn = false;
    }

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
