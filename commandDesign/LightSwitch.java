package commandDesign;

public class LightSwitch {

        //This is the receiver

    private int brightness = 25;

    public void on() {
        System.out.println("The light is on!");
    }
   
    public void off() {
        System.out.println("The light is off!");
    }
    
    public void increase() {
        brightness++;
        System.out.println("Current Brightness Level: " + brightness);
    }
    
    public void decrease() {
        brightness--;
        System.out.println("Current Brightness Level: " + brightness);
    }

}
