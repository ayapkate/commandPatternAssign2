package commandDesign;

public class VolDownMusic implements Command{

    //Concrete Command #11
        private MusicPlayer music;

    public VolDownMusic(MusicPlayer music) {
        this.music = music;
    }

    public void execute() {
        music.decrease();
    }

    public void undo() { //opposite dapat d2
        music.increase();
    }

}
