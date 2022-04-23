package racingcar.car;

import org.assertj.core.util.Lists;

import java.util.List;

import static racingcar.ErrorMessage.*;

public class CarName {
    private final String carName;
    private static final String CAR_NAME_DELIMITER = ",";
    private static final int CAR_NAME_MAX_LENGTH = 5;

    public CarName(String name) {
        checkValidation(name.trim());
        this.carName = name.trim();
    }

    private void checkValidation(String name) {
        if (name.length() > CAR_NAME_MAX_LENGTH) {
            throw new IllegalArgumentException(CAR_NAME_OVER_LENGTH + " 최대 " + CAR_NAME_MAX_LENGTH + "자.");
        }

        if (name.isEmpty()) {
            throw new IllegalArgumentException(CAR_NAME_EMPTY);
        }
    }

    public String toText() {
        return carName;
    }

    public static List<CarName> splitInputCarNames(String input) {
        List<CarName> carNames = Lists.newArrayList();
        for (String carName : input.split(CAR_NAME_DELIMITER)) {
            carNames.add(new CarName(carName));
        }
        return carNames;
    }
}
