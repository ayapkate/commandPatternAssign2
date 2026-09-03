package commandDesign;

public class PowerOnLightSwitch implements Command{

    //Concrete Command #8

    private LightSwitch lights;

    public PowerOnLightSwitch(LightSwitch lights) {
        this.lights = lights;
    }

    @Override 
    public void execute() {
        lights.on();
    }

    @Override
    public void undo() { //opposite dapat d2
        lights.off();
    }
}