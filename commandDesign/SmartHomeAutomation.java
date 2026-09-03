package commandDesign;

public class SmartHomeAutomation {
    public static void main(String[] args) {

        //CLIENT
        MusicPlayer spotify = new MusicPlayer();
        LightSwitch livingRoom = new LightSwitch();
        Thermostat thermostat = new Thermostat();
        UniversalRemote rc = new UniversalRemote();
        
        System.out.println("____________________________________________________");
        System.out.println("                   Music Status..");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.println("=====================|Spotify|=======================");
        Command powerOn = new PowerOnMusic(spotify);
        rc.submit(powerOn);
     
        System.out.println("____________________________________________________");
        System.out.println("                     Volume");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        Command increaseVol = new VolUpMusic(spotify);
        rc.submit(increaseVol);
        System.out.println("-----------------------------------------------------");
        Command decreaseVol = new VolDownMusic(spotify);
        rc.submit(decreaseVol);
        rc.submit(decreaseVol);

     
        System.out.println("____________________________________________________");
        System.out.println("                     Living Room");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        powerOn = new PowerOnLightSwitch(livingRoom);
        rc.submit(powerOn);
     
        System.out.println("____________________________________________________");
        System.out.println("                      Brightness");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        Command brightlvl = new IncreaseBrightness(livingRoom);
        rc.submit(brightlvl);
        System.out.println("-----------------------------------------------------");
        brightlvl = new DecreaseBrightness(livingRoom);
        rc.submit(brightlvl);
        rc.submit(brightlvl);
        
        
        System.out.println("____________________________________________________");
        System.out.println("                  Thermostat Status");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        powerOn = new PowerOnThermostat(thermostat);
        rc.submit(powerOn);
 

        System.out.println("____________________________________________________");
        System.out.println("                Thermostat Temperature");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        

    }
}
