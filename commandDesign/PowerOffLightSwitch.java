package commandDesign;

public class PowerOffLightSwitch implements Command{

    //Concrete Command #5

    private LightSwitch lights;

    public PowerOffLightSwitch(LightSwitch lights) {
        this.lights = lights;
    }

    public void execute() {
        lights.off();
    }

    public void undo() { //opposite dapat d2
        lights.on();
    }

}
