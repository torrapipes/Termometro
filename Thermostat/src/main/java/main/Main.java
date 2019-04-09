package main;

import hardware.GasHeater;
import hardware.Regulator;
import hardware.RemoteCommandSensor;
import interfaces.Heater;
import interfaces.Thermometer;
import other.Pikachu;
import types.RoomTemperature;

public class Main {


    public static void main( String[] args ) {

        final double minTemp = 15.0;
        final double maxTemp = 21.0;

        RoomTemperature temperature = RoomTemperature.getInstance(15);
        Heater heater = new GasHeater();
        Thermometer thermometer = new RemoteCommandSensor();

        Regulator regulator = new Regulator();

        System.out.println( "Arrancando..." );
        regulator.regulate(thermometer, heater, minTemp, maxTemp, temperature);

        Pikachu pika = new Pikachu();
        System.out.println( "\nArrancando a Yoda: " );
        regulator.regulate(thermometer, pika, minTemp, maxTemp, temperature);
        pika.speak();

    }


}
