package chapterThree;

public class Television {

    private boolean turnOnTv;
    private int channel = 1;
    private int volume = 1;

    public boolean isTurnOnTv() {
        return turnOnTv;
    }

    public void setTurnOnTv(boolean turnOnTv) {
        this.turnOnTv = turnOnTv;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (turnOnTv && channel >= 1 && channel <= 120) {
            this.channel = channel;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (turnOnTv && volume >= 1 && volume <= 100) {
            this.volume = volume;
        }
    }

    public void toggleTv() {
        turnOnTv = !turnOnTv;
    }

    public void increaseVolume() {
        if (turnOnTv && volume < 100) {
            volume += 2;
        }
    }

    public void decreaseVolume() {
        if (turnOnTv && volume > 0) {
            volume -= 2;
        }
    }
}
