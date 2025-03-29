package mover;
import static java.lang.System.out;

public abstract class mover {
    boolean isOn;

    public void moverIsOn() {
        out.println("mover is on");
        isOn = true;
    }

    public void moverIsOff() {
        out.println("mover is off");
        isOn = false;
    }

    public abstract boolean isRunning();
}