package commandDesign;

public class UniversalRemote {

    //Invoker

    public void submit(Command command) {
        command.execute();
    }
    
}
