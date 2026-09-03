package commandDesign;

public class VolUpMusic implements Command{
    //Concrete Command #12
    private MusicPlayer music;

    public VolUpMusic(MusicPlayer music) {
        this.music = music;
    }

    @Override 
    public void execute() {
        music.increase();
    }

}
