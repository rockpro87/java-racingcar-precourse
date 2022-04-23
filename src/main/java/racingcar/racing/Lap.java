package racingcar.racing;

import static racingcar.ErrorMessage.LAP_COUNT_NOT_NUMBER;

public class Lap {
    private final int count;
    private static final String REGEX_LAP_INPUT = "[0-9]+";

    public Lap(String count) {
        checkValidation(count);
        this.count = Integer.parseInt(count);
    }

    public int getCount() {
        return count;
    }

    private void checkValidation(String count) {
        if (!count.matches(REGEX_LAP_INPUT)) {
            throw new IllegalArgumentException(LAP_COUNT_NOT_NUMBER);
        }
    }
}
