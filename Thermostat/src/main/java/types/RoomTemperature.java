package types;

public class RoomTemperature{

    // Atributos
    private static RoomTemperature ROOM;

    private int temperature = 0;


    // Constructor
    private RoomTemperature(int temperature){

        this.setTemperature(temperature);

    }


    // Métodos
    public static RoomTemperature getInstance(int temperature){

        if (ROOM == null){
            ROOM = new RoomTemperature(temperature);
        }

        return ROOM;

    }


    public int getTemperature() {
        return temperature;
    }


    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


    public void modifyTemperature(int temperature){
        this.setTemperature(this.getTemperature() + temperature);
    }


}
