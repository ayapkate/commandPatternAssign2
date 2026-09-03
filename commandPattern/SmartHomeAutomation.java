package commandPattern;
import java.util.ArrayList;
import java.util.List;

public class SmartHomeAutomation {
    public static void main(String[] args) {

        MusicPlayer spotify = new MusicPlayer();
        LightSwitch livingRoom = new LightSwitch();
        Thermostat livingRoomThermostat = new Thermostat();
        //

        System.out.println("____________________________________________________");
        System.out.println("                   Music Status..");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.println("=====================|Spotify|=======================");
        spotify.on();
        spotify.off();

        System.out.println("____________________________________________________");
        System.out.println("                     Volume");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        spotify.increase();
        spotify.decrease();

        System.out.println("____________________________________________________");
        System.out.println("                     Living Room");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        livingRoom.on();
        livingRoom.off();

        System.out.println("____________________________________________________");
        System.out.println("                      Brightness");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        livingRoom.increase();
        livingRoom.decrease();

        System.out.println("____________________________________________________");
        System.out.println("                  Thermostat Status");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        livingRoomThermostat.on();
        livingRoomThermostat.off();

        System.out.println("____________________________________________________");
        System.out.println("                Thermostat Temperature");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        livingRoomThermostat.increase();
        livingRoomThermostat.increase();
        livingRoomThermostat.decrease();


        //this is to turn of multiple devices
        List<CentralHub> allDevices = new ArrayList<CentralHub>();
        allDevices.add(spotify);
        allDevices.add(livingRoom);
        allDevices.add(livingRoomThermostat);

        System.out.println("____________________________________________________");
        System.out.println("            Powering Off All Devices...");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        TurnAllOff turnOffDevices = new TurnAllOff(allDevices);
        UniversalRemote turnThemOff = new UniversalRemote(turnOffDevices);

        turnThemOff.press();

        System.out.println("____________________________________________________");
        System.out.println("              Powering On All Devices...");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        turnThemOff.pressUndo();

    }
}
