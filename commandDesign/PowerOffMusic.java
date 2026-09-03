package commandDesign;

public class PowerOffMusic implements Command{

    //Concrete Command #6

    private MusicPlayer music;

    public PowerOffMusic(MusicPlayer music) {
        this.music = music;
    }

    @Override
    public void execute() { //main
        music.off();
    }
    
    
}
