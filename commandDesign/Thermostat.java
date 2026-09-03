package commandDesign;

public class Thermostat {

    //ito ang receiver

    private int temperature = 20;

    public void on() {
        System.out.println("Powering On..");
        System.out.println("Thermostat is on.");
    }

    public void off() {
        System.out.println("Powering Off..");
        System.out.println("The Thermostat is off.");
    }

    public void increase() {
        temperature++;
        System.out.println("Current Temperature Level: " + temperature + "° ");
    }

    public void decrease() {
        temperature--;
        System.out.println("Current Temperature Level: " + temperature + "° ");
    }

}
