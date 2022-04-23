package racingcar;

import org.assertj.core.util.Lists;
import racingcar.car.CarName;

import java.util.List;

public class RacingUtils {

    public static Move isGo(int value){
        return Move.isGo(value);
    }

    public static List<CarName> splitCarName(String input) {
        List<CarName> carNames = Lists.newArrayList();
        for (String carName : input.split(",")) {
            carNames.add(new CarName(carName));
        }
        return carNames;
    }
}
