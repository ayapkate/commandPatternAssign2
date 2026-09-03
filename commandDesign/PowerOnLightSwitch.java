package commandDesign;

public class PowerOnLightSwitch implements Command{

    //Concrete Command #8

    private LightSwitch lights;

    public PowerOnLightSwitch(LightSwitch lights) {
        this.lights = lights;
    }

    public void execute() {
        lights.on();
    }

    public void undo() { //opposite dapat d2
        lights.off();
    }
    