package commandDesign;

public class PowerOnThermostat implements Command{

    //Concrete Command #10
  
    private Thermostat thermostat;

    public PowerOnThermostat(Thermostat thermostat) {
        this.thermostat = thermostat;
    }
    
    @Override 
    public void execute() {
        thermostat.on();
    }
    
    
    @Override
    public void undo() { //opposite dapat d2
        thermostat.off();
    }
    
}
