package racingcar;

import java.util.List;

public class Entry {
    private final List<Car> cars;

    public Entry(List<CarName> carNames) {
        this.cars = Car.toList(carNames);
    }

    public List<Car> getEntryList() {
        return this.cars;
    }
}
