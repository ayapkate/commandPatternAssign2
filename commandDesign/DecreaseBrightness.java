package commandDesign;

public class DecreaseBrightness implements Command{
    //Concrete Command #1

    private LightSwitch lights;

    public DecreaseBrightness(LightSwitch lights) {
        this.lights = lights;
    }

    public DecreaseBrightness() {
    }

    @Override 
    public void execute() {
         lights.decrease();
    }

    @Override
    public void undo() {
        lights.increase();
    }
    
}
