package device_management;


import behaviours.ILikeToSendDatable;

public abstract class VideoDevice implements ILikeToSendDatable {
    private int screenSize;
    private int pixels;

    public VideoDevice(int screenSize, int pixels) {
        this.screenSize = screenSize;
        this.pixels = pixels;
    }

    public int getScreenSize() {
        return this.screenSize;
    }

    public int getPixels() {
        return this.pixels;
    }

    public String display(String data) {
        return data + " is now on screen";
    }

    @Override
    public String sendData(){
        return "Here is some video information, enjoy!";
    }
}
