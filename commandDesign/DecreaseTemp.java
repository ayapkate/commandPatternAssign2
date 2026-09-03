package commandDesign;

public class DecreaseTemp implements Command{
    //Concrete Command #2

       private Thermostat thermostat;
       
    public DecreaseTemp(Thermostat thermostat) {
        this.thermostat = thermostat;
    }
    
    @Override 
    public void execute() {
        thermostat.decrease();
    }

    @Override
    public void undo() {
        thermostat.increase();
    }

    
}
