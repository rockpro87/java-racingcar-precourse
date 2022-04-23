package racingcar;

import camp.nextstep.edu.missionutils.Console;
import racingcar.racing.Entry;
import racingcar.racing.Lap;
import racingcar.racing.LapResults;

public class RacingView {
    private final static String INPUT_CAR_NAME = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private final static String INPUT_LAP_COUNT = "시도할 회수는 몇회인가요?";

    public static Entry inputCarName() {
        try {
            System.out.println(INPUT_CAR_NAME);
            return new Entry(RacingUtils.splitCarName(console()));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return inputCarName();
        }
    }

    public static Lap inputLapCount() {
        try {
            System.out.println(INPUT_LAP_COUNT);
            return new Lap(console());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return inputLapCount();
        }
    }

    public static void printLapResult(LapResults lapResults) {
        lapResults.getLapResult().forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println();
    }

    private static String console() {
        return Console.readLine();
    }
}