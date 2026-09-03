package commandPattern;

public class UniversalRemote {
    Command theCommand;

    public UniversalRemote(Command newCommand) {
        theCommand = newCommand;
    }

    public void press() {
        theCommand.execute();
    }

    public void pressUndo() {
        theCommand.undo();
    }


}
