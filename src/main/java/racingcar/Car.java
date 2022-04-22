package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

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
        if (RacingUtils.isGo(Randoms.pickNumberInRange(0, 9)).equals(Move.GO)) {
            this.location.moveForward();
        }
    }
}
