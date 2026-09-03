package commandDesign;

public class VolUpMusic implements Command{
    //Concrete Command #12
    private MusicPlayer music;

    public VolUpMusic(MusicPlayer music) {
        this.music = music;
    }

    public void execute() {
        music.increase();
    }

    public void undo() { //opposite dapat d2
        music.decrease();
    }

}
