package commandDesign;

public class PowerOffThermostat implements Command{

    //Concrete Command #7

    private Thermostat thermostat;

    public PowerOffThermostat(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override 
    public void execute() {
        thermostat.off();
    }

    @Override
    public void undo() { //opposite dapat d2
        thermostat.on();
    }

  
    
}
