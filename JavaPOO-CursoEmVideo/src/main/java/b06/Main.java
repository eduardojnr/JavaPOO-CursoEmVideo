
package b06;

public class Main {

    public static void main(String[] args) {
        RemoteControl c = new RemoteControl();
        c.turnOn();
        c.openMenu();
        c.increaseVolume();
        System.out.println("Increase volume");
        c.openMenu();
        c.mute();
        System.out.println("Mute");
        c.openMenu();
        c.unmute();
        System.out.println("Unmute");
        c.openMenu();
    }
}