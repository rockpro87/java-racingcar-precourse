package racingcar.car;

import camp.nextstep.edu.missionutils.Randoms;
import org.assertj.core.util.Lists;

import java.util.List;

import static racingcar.Config.MOVE_BOUNDARY;

public class Car {
    private final CarName name;
    private final CarLocation location;

    public Car(CarName name) {
        this.name = name;
        this.location = new CarLocation();
    }

    public CarName getName() {
        return this.name;
    }

    public CarLocation getLocation() {
        return this.location;
    }

    public void randomMove() {
        if (isGo(Randoms.pickNumberInRange(0, 9))) {
            this.location.moveForward();
        }
    }

    public static List<Car> toList(List<CarName> carNames) {
        List<Car> results = Lists.newArrayList();
        for (CarName carName : carNames) {
            results.add(new Car(carName));
        }
        return results;
    }

    private boolean isGo(int value) {
        return value > MOVE_BOUNDARY;
    }
}
