package commandDesign;

public class MusicPlayer  {

    //ito ang receiver
    
    private int volume = 30; //inserting a starting value so that I can track if the VolUp and VolDown is working
    
    public void on() {
        System.out.println("Opening App....");
        System.out.println("App..Opened..");
        System.out.println("Playing: Chicago From Michael Jackson Hits..");
    }

    public void off() {
        System.out.println("Paused: Chicago From Michael Jackson Hits..");
        System.out.println("Closing App....");
        System.out.println("App..Closed..");

    }
   
    public void increase() {
        volume++;
        System.out.println("Music Player Current Volume: " + volume);
    }
    
    public void decrease() {
        volume--;
        System.out.println("Music Player Current Volume: " + volume);
    }

}
