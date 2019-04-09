package hardware;

import interfaces.Thermometer;
import types.RoomTemperature;

public class RemoteCommandSensor implements Thermometer {

    public RemoteCommandSensor(){}

    @Override
    public int read(RoomTemperature temperature) {
        return 0;
    }
}
