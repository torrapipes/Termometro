package other;

import interfaces.Heater;
import types.RoomTemperature;

public class Pikachu implements Heater {


    public Pikachu(){}


    public void speak() {

        System.out.println("Pika pika");

    }


    @Override
    public void engage(RoomTemperature temperature) {

        temperature.modifyTemperature(+1000);

    }


    @Override
    public void disengage(RoomTemperature temperature) {

        temperature.modifyTemperature(-1000);

    }



}
