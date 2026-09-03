package commandDesign;

public class DecreaseBrightness implements Command{
    //Concrete Command #1

    private LightSwitch lights;

    public DecreaseBrightness(LightSwitch lights) {
        this.lights = lights;
    }

    public void execute() {
         lights.decrease();
    }

    public void undo() {
        lights.increase();
    }
    
}
