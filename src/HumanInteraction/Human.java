package HumanInteraction;

import Exceptions.InvalidDriverException;

public class Human {

    private String name;
    private int age;
    private double height;
    private String driverLicence;
    private String physicalCondition;

    private boolean doorOpen;

    public Human(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public boolean toggleDoor(){
        doorOpen = !doorOpen;
        return doorOpen;
    }

    public boolean enterCar(){
        return true;
    }

    public boolean startEngine(){
       if (hasValidDriverLicense()){
           return true;
       } else {
           throw new InvalidDriverException("You are not Eligible to drive");
       }

        }

    private boolean hasValidDriverLicense() {
        return hasValidAge() && hasValidHeight() && driverLicence != null && !driverLicence.isEmpty();
    }

    private boolean hasValidAge() {
        return age >= 18;
    }

    private boolean hasValidHeight(){
        return height >= 140.0;
    }

    public void drive(){
    }

    public void stopEngine(){
    }

    public void exitCar(){
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }
}
