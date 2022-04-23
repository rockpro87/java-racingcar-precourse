package racingcar;

public class Config {
    public final static int MOVE_BOUNDARY = 3;
    public final static int CAR_NAME_MAX_LENGTH = 5;
    public final static String REGEX_LAP_INPUT = "[0-9]+";
    public final static String CAR_NAME_DELIMITER = ",";

    public final static String ERROR_PREFIX = "[ERROR] ";
    public final static String ERROR_CAR_NAME_LENGTH = ERROR_PREFIX + "자동차 이름은 %d자 이하만 가능합니다.";
    public static final String ERROR_CAR_NAME_EMPTY = ERROR_PREFIX + "자동차 이름은 빈값일 수 없습니다.";
    public final static String ERROR_LAP_COUNT_NOT_NUMBER = ERROR_PREFIX + "시도 횟수는 숫자여야 한다.";
    public static final String ERROR_ENTRY_NOT_VALID_SIZE = ERROR_PREFIX + "레이싱은 최소 두개의 자동차가 있어야합니다.";

}
