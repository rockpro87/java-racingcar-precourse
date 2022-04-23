package racingcar.car;

public class CarLocation {
    private String text;
    private int number;
    private static final String FORWARD_TEXT = "-";

    public CarLocation() {
        this.number = 0;
        this.text = "";
    }

    public void moveForward() {
        this.text = this.text + FORWARD_TEXT;
        this.number = this.text.length();
    }

    public int toNumber() {
        return this.number;
    }

    public String toResultText() {
        return this.text;
    }
}
