package racingcar.racing;

import racingcar.car.Car;
import racingcar.car.CarName;

import java.util.List;

import static racingcar.Config.ERROR_ENTRY_NOT_VALID_SIZE;

public class Entry {
    private final List<Car> cars;
    private final static int MIN_ENTRY_SIZE = 2;

    public Entry(List<CarName> carNames) {
        this.cars = Car.toList(carNames);
        checkValidation(this.cars);
    }

    public List<Car> getEntryList() {
        return this.cars;
    }

    private void checkValidation(List<Car> cars) {
        if (cars.size() < MIN_ENTRY_SIZE) {
            throw new IllegalArgumentException(ERROR_ENTRY_NOT_VALID_SIZE);
        }
    }
}
