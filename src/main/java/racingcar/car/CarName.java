package racingcar.car;

import org.assertj.core.util.Lists;
import racingcar.Config;

import java.util.List;

import static racingcar.Config.*;

public class CarName {
    private final String carName;

    public CarName(String name) {
        checkValidation(name.trim());
        this.carName = name.trim();
    }

    private void checkValidation(String name) {
        if (name.length() > CAR_NAME_MAX_LENGTH) {
            throw new IllegalArgumentException(String.format(ERROR_CAR_NAME_LENGTH, CAR_NAME_MAX_LENGTH));
        }

        if (name.isEmpty()) {
            throw new IllegalArgumentException(ERROR_CAR_NAME_EMPTY);
        }
    }

    public String toText() {
        return carName;
    }

    public static List<CarName> splitInputCarNames(String input) {
        List<CarName> carNames = Lists.newArrayList();
        for (String carName : input.split(Config.CAR_NAME_DELIMITER)) {
            carNames.add(new CarName(carName));
        }
        return carNames;
    }
}
