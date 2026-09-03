package commandPattern;

public class Thermostat implements CentralHub {

    private int temperature = 24;

    @Override
    public void on() {
        System.out.println("The thermostat is turned on!");
    }

    @Override
    public void off() {
        System.out.println("The thermostat is turned off!");
    }

    @Override
    public void increase() {
        temperature++;
        System.out.println("Current Temperature: " + temperature + "° ");
    }

    @Override
    public void decrease() {
        temperature--;
        System.out.println("Current Temperature: " + temperature +"° ");
    }
}
