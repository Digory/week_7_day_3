package device_management;

import behaviours.ILikeToSendDatable;
import behaviours.IPluggable;

public class Mouse implements ILikeToSendDatable, IPluggable {
    private MouseType mouseType;
    private boolean pluggedIn;

    public Mouse(MouseType mouseType) {
        this.mouseType = mouseType;
        pluggedIn = false;
    }

    public void plugIn() {
        pluggedIn = true;
    }

    public void unplug() {
        pluggedIn = false;
    }

    public MouseType getMouseType() {
        return mouseType;
    }

    public String clickButton(){
        return "Well done for clicking the button";
    }

    public int getNumberOfButtons(){
        return mouseType.getNumberOfButtons();
    }

    @Override
    public String sendData() {
        return "Here is some mouse data, enjoy";
    }

    @Override
    public boolean amIPluggedIn() {
        return pluggedIn;
    }
}
