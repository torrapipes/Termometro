package hardware;

import interfaces.Heater;
import types.RoomTemperature;

public class GasHeater implements Heater {


    public GasHeater(){}


    public void engage(RoomTemperature temperature){

        temperature.modifyTemperature(1);

    }


    public void disengage(RoomTemperature temperature){

        temperature.modifyTemperature(-1);

    }




}
