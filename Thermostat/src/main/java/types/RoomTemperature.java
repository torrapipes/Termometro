package types;

public class RoomTemperature{

    private int temperature = 0;

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
