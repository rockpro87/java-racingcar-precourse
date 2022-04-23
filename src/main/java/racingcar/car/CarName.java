package racingcar.car;

import static racingcar.Config.CAR_NAME_MAX_LENGTH;
import static racingcar.Config.ERROR_CAR_NAME_LENGTH;

public class CarName {
    private final String carName;

    public CarName (String name) {
        checkValidation(name);
        this.carName = name;
    }

    private void checkValidation(String name) {
        if (name.length() > CAR_NAME_MAX_LENGTH) {
            throw new IllegalArgumentException(String.format(ERROR_CAR_NAME_LENGTH, CAR_NAME_MAX_LENGTH));
        }
    }

    public String toText() {
        return carName;
    }
}
