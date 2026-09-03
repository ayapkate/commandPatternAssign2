package commandDesign;

public class PowerOnThermostat implements Command{

    //Concrete Command #10
  
    private Thermostat thermostat;

    public PowerOnThermostat(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    public void execute() {
        thermostat.on();
    }

    public void undo() { //opposite dapat d2
        thermostat.off();
    }
    
}
