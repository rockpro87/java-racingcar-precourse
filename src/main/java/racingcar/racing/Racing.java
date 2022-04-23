package racingcar.racing;

import racingcar.car.Car;

public class Racing {
    private final Entry entry;
    private final Lap lap;

    public Racing(Entry entry, Lap lap) {
        this.entry = entry;
        this.lap = lap;
    }

    public void start() {
        for (int i = 0; i < lap.getCount(); i++) {
            entry.getEntryList().forEach((Car::randomMove));
        }
    }
}
