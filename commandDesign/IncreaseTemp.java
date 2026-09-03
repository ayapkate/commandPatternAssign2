package commandDesign;

public class IncreaseTemp implements Command{
    //Concrete Command #4

       private Thermostat thermostat;
       
    public IncreaseTemp(Thermostat thermostat) {
        this.thermostat = thermostat;
    }
    
    public void execute() {
        thermostat.decrease();
    }

    public void undo() {
        thermostat.increase();
    }
   
}
