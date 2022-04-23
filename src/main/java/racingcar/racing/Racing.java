package racingcar.racing;

import racingcar.car.Car;

public class Racing {
    private final Entry entry;

    public Racing(Entry entry) {
        this.entry = entry;
    }

    public LapResults lapResult() {
        entry.getEntryList().forEach((Car::randomMove));
        return new LapResults(entry.getEntryList());
    }
}
