package interfaces;

import types.RoomTemperature;

public interface Heater {

    void engage(RoomTemperature temperature);

    void disengage(RoomTemperature temperature);

}
