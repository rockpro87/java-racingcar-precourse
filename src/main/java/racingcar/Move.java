package racingcar;

import static racingcar.Config.MOVE_BOUNDARY;

public enum Move {
    STOP, GO;

    public static Move isGo(int value) {
        return value > MOVE_BOUNDARY ? Move.GO : Move.STOP;
    }
}
