package commandDesign;

public class DecreaseBrightness implements Command { 

    //Concrete Command

    private LightSwitch lights;

    public DecreaseBrightness(LightSwitch lights) {
        this.lights = lights;
    }


    @Override 
    public void execute() {
         lights.decrease();
    }

}
