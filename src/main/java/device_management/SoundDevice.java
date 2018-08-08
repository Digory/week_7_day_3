package device_management;

import behaviours.ILikeToSendDatable;

public class SoundDevice implements ILikeToSendDatable {
    int maxVolume;

    public int getMaxVolume() {
        return this.maxVolume;
    }

    public SoundDevice(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public String playSound(String sound) {
        return "playing: " + sound;
    }

    @Override
    public String sendData() {
        return "Here is some sound data, enjoy!";
    }
}
