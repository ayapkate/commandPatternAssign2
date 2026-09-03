package commandPattern;

public class LightSwitch implements CentralHub {

    private int brightness = 0;

    @Override
    public void on() {
        System.out.println("The Light is on!");
    }

    @Override
    public void off() {
        System.out.println("The light is off!");
    }

    @Override
    public void increase() {
        brightness++;
        System.out.println("Current Brightness Level: " + brightness);
    }

    @Override
    public void decrease() {
        brightness--;
        System.out.println("Current Brightness Level: " + brightness);

    }
}
