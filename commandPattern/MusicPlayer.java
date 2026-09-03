public class MusicPlayer implements CentralHub {

    private int volume = 0;

    @Override
    public void on() {
        System.out.println("Spotify..Opened..");
        System.out.println("Playing: Chicago From Michael Jackson Hits..");
    }

    @Override
    public void off() {
        System.out.println("Paused: Chicago From Michael Jackson Hits..");
        System.out.println("App closed..");
    }

    @Override
    public void increase() {
        volume++;
        System.out.println("Music Player Current Volume: " + volume);
    }

    @Override
    public void decrease() {
        volume--;
        System.out.println("Music Player Current Volume: " + volume);
    }
}
