package chapterThree;

import java.util.ArrayList;

public class Fridge {
    private ArrayList<String> itemListInFridge = new ArrayList<>();
    private int temp = 1;
    private boolean onFridge = false;
    private boolean offFridge = false;
    private boolean doorOpen = false;
    private boolean toggleLight = false;


    public boolean isDoorOpen(){
        return doorOpen;
    }
    public void toggle(){
        doorOpen = !doorOpen;
        toggleLight = !toggleLight;
    }
    public boolean isOnFridge() {
        return onFridge;
    }
    public boolean isOffFridge() {
        return offFridge;
    }

    public void setOnFridge(boolean onFridge){
        this.onFridge = onFridge;
    }

    public void setOffFridge(boolean offFridge){
        this.offFridge = onFridge;
    }
    public void increaseTemp(){
        if (onFridge && temp >= 1 && temp < 7){
            temp ++;
        } else if(onFridge && temp > 7){
            temp = 7;
        }
    }

    public void decreaseTemp(){
        if (onFridge && temp > 1 && temp <= 7){
            temp --;
        } else if (onFridge && temp < 1 ){
            temp = 1;
        }
    }

    public void addItem(String item) {
        itemListInFridge.add(item);
    }

    public void removeItem(String item){
        itemListInFridge.remove(item);
    }

    public ArrayList<String> getItemListInFridge() {
        return itemListInFridge;
    }
    public int getTemperature() {
        return temp;
    }


}
