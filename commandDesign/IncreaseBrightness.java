package commandDesign;

public class IncreaseBrightness implements Command{
    //Concrete Command #3
 
    private LightSwitch lights;

    public IncreaseBrightness(LightSwitch lights) {
        this.lights = lights;
    }

    @Override 
    public void execute() {
        lights.increase();
    }

    @Override
    public void undo() {
        lights.decrease();
    }
    
}
