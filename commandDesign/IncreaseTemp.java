package commandDesign;

public class IncreaseTemp implements Command{
    //Concrete Command #4

       private Thermostat thermostat;
       
    public IncreaseTemp(Thermostat thermostat) {
        this.thermostat = thermostat;
    }
    @Override 
    public void execute() {
        thermostat.decrease();
    }


   
}
