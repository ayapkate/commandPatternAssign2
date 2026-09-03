package commandPattern;

import java.util.List;
public class TurnAllOff implements Command {
    List<CentralHub> theDevices;

    public TurnAllOff(List<CentralHub> newDevices) {
        theDevices = newDevices;
    }

    @Override
    public void execute() {
        for(CentralHub device : theDevices) {
            device.off();
        }
    }

    @Override
    public void undo() {
        for(CentralHub device : theDevices) {
            device.on();
        }
    }

}