package device_management;

public enum MouseType {
    MOUSEPAD(0),
    LASER(1),
    BALL(2);

    private int numberOfButtons;

    MouseType(int numberOfButtons) {
        this.numberOfButtons = numberOfButtons;
    }

    public int getNumberOfButtons() {
        return numberOfButtons;
    }
}
