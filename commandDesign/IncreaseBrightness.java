package commandDesign;

public class IncreaseBrightness implements Command{
    //Concrete Command #3
 
    private LightSwitch lights;

    public IncreaseBrightness(LightSwitch lights) {
        this.lights = lights;
    }

    public void execute() {
        lights.increase();
    }

    public void undo() {
        lights.decrease();
    }
    
}
