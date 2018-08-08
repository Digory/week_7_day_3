package device_management;

import behaviours.ILikeToSendDatable;

public abstract class PrintingDevice implements ILikeToSendDatable {
    private String make;
    private String model;

    public PrintingDevice(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    @Override
    public String sendData(){
        return "Here is some printing information, enjoy!";
    }

    public String display(String data) {
        return "now displaying: " + data;
    }
}
