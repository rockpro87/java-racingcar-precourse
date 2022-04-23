package racingcar.racing;

import racingcar.Config;

import static racingcar.Config.ERROR_LAP_COUNT_NOT_NUMBER;

public class Lap {
    private final int count;

    public Lap(String count) {
        checkValidation(count);
        this.count = Integer.parseInt(count);
    }

    public int getCount() {
        return count;
    }

    private void checkValidation(String count) {
        if (!count.matches(Config.REGEX_LAP_INPUT)) {
            throw new IllegalArgumentException(ERROR_LAP_COUNT_NOT_NUMBER);
        }
    }
}
