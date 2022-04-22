package racingcar;

public enum Move {
    STOP, GO;

    public static Move isGo(int value) {
        return value > 3 ? Move.GO : Move.STOP;
    }
}
