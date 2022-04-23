package racingcar.racing;

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
        if (!count.matches("[0-9]+")) {
            throw new IllegalArgumentException(ERROR_LAP_COUNT_NOT_NUMBER);
        }
    }
}
