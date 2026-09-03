package commandDesign;

public class PowerOffThermostat implements Command{

    //Concrete Command #7

    private Thermostat thermostat;

    public PowerOffThermostat(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    public void execute() {
        thermostat.off();
    }


    public void undo() { //opposite dapat d2
        thermostat.on();
    }
    
}
