package commandDesign;

public class PowerOffLightSwitch implements Command{

    //Concrete Command 5

    private LightSwitch lights;

    public PowerOffLightSwitch(LightSwitch lights) {
        this.lights = lights;
    }

    @Override 
    public void execute() {
        lights.off();
    }


}
