package device_management;

import behaviours.ILikeToSendDatable;
import behaviours.IPluggable;

public class Keyboard implements ILikeToSendDatable, IPluggable {
    private int numberOfMissingButtons;
    private boolean pluggedIn;

    public Keyboard(int numberOfMissingButtons) {
        this.numberOfMissingButtons = numberOfMissingButtons;
        pluggedIn = false;
    }

    public int getNumberOfMissingButtons() {
        return numberOfMissingButtons;
    }

    @Override
    public String sendData() {
        return "Here is some keyboard data, enjoy! :-)";
    }

    @Override
    public void plugIn() {
        pluggedIn = true;
    }

    @Override
    public void unplug() {
        pluggedIn = false;
    }

    @Override
    public boolean amIPluggedIn() {
        return pluggedIn;
    }
}
