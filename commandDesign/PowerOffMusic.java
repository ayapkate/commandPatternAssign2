package commandDesign;

public class PowerOffMusic implements Command{

    //Concrete Command #6

    private MusicPlayer music;

    public PowerOffMusic(MusicPlayer music) {
        this.music = music;
    }

    public void execute() { //main
        music.off();
    }

    public void undo() { //opposite dapat d2
        music.on();
    }

  
    
}
