package racingcar.car;

public class CarName {
    private final String carName;

    public CarName (String name) {
        this.carName = name;
    }

    public String toText() {
        return carName;
    }
}
