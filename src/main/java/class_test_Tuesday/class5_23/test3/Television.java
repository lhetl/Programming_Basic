package class_test_Tuesday.class5_23.test3;

public class Television {
    private String isOn;
    private int volume;
    private int channel;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(this.isOn=="On")this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if(this.isOn=="On")this.channel = channel;
    }
    public void turnOn(){
        this.isOn="On";
    }
    public  void turnOff(){
        this.isOn="Off";
    }

    public String toString() {
        return "상태:" + isOn +
                ", 볼륨:" + volume +
                ", 채널:" + channel;
    }
}
