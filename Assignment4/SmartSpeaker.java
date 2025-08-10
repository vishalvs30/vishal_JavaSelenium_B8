package Assignment4;

abstract class SmartDevice {
    abstract void turnOn();
    abstract void turnOff();
    abstract void performFunction();
}

class SmartPhone extends SmartDevice {
    void turnOn() { System.out.println("Phone ON"); }
    void turnOff() { System.out.println("Phone OFF"); }
    void performFunction() { System.out.println("Calling & Browsing"); }
}

class SmartWatch extends SmartDevice {
    void turnOn() { System.out.println("Watch ON"); }
    void turnOff() { System.out.println("Watch OFF"); }
    void performFunction() { System.out.println("Tracking Fitness"); }
}

public class SmartSpeaker extends SmartDevice {
    void turnOn() { System.out.println("Speaker ON"); }
    void turnOff() { System.out.println("Speaker OFF"); }
    void performFunction() { System.out.println("Playing Music"); }

    public static void main(String[] args) {
        SmartDevice[] devices = {
            new SmartPhone(),
            new SmartWatch(),
            new SmartSpeaker()
        };

        for (SmartDevice device : devices) {
            device.performFunction();
        }
    }
}
