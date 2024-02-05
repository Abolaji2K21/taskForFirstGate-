package chapterThree;

public class AirCondition {

    private boolean acOff;
    private boolean acOn;
    private int temperature;



    public boolean getAcOff(){
        return acOff;
    }

    public boolean getAcOn(){
        return acOn;
    }

    public  int getTemperature(){
        return temperature;
    }

    public void setTemperature(int temperature){
        if(getAcOn() && temperature >= 16 && temperature <=30) {
            this.temperature = temperature;
        }
    }

    public void setAcOff(boolean acOff){
        this.acOff= acOff;
    }

    public void setAcOn(boolean acOn){
        this.acOn = acOn;
    }


}
