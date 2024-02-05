package chapterThree;

public class Bike {

    private boolean BikeOn;
    private boolean BikeOff;
    private int gear = 1;
    private int speed;

    public boolean isBikeOn() {
        return BikeOn;
    }

    public void setBikeOn(boolean bikeOn) {
        if (gear >= 1 && gear <= 4) {
            speed += gear;
        }
        this.BikeOn = bikeOn;
    }

    public boolean isBikeOff() {
        return BikeOff;
    }

    public void setBikeOff(boolean bikeOff) {
        BikeOff = bikeOff;
    }



     public int getGear() {
        if (speed >= 0 && speed <=20){
            gear = 1;
        } else if (speed >= 21 && speed <=30){
            gear = 2;

        } else if (speed >=31 && speed <= 40){
            gear = 3;

        } else {

            gear = 4;
        }
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
            this.speed = speed;
    }

    public void  accelerate() {
        if (BikeOn) {

            gear = getGear();
            if (gear == 1) {
                speed += 1;
            } else if(gear == 2){
                speed +=2;
            } else if(gear == 3){
                speed +=3;
            } else if(gear == 4){
                speed +=4;
            }

            gear = getGear();
        }
    }

    public void decelerate(){
        if(BikeOn){

            gear = getGear();

            if (gear == 1) {
                speed -= 1;
            } else if (gear == 2){
                speed -= 2;
            } else if (gear == 3){
                speed -= 3;
            } else if (gear == 4){
                speed -= 4;
            }
            gear = getGear();

        }
    }



}
