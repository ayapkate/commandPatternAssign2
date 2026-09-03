package commandDesign;

public class PowerOnMusic implements Command{

    //Concrete Command #9

    private MusicPlayer music;

    public PowerOnMusic(MusicPlayer music) {
        this.music = music;
    }

    @Override
    public void execute() {
        music.on();
    }

    @Override
    public void undo() { //opposite dapat d2
        music.off();
    }
   
}
