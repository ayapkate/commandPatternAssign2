package commandDesign;

public class PowerOnMusic implements Command{

    //Concrete Command #9

    private MusicPlayer music;

    public PowerOnMusic(MusicPlayer music) {
        this.music = music;
    }

    public void execute() {
        music.on();
    }
    
    public void undo() { //opposite dapat d2
        music.off();
    }
   
}
