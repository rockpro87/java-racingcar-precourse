package racingcar.racing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.car.CarName;

import static org.assertj.core.api.Assertions.assertThat;

public class EntryTest {
    Entry entry;

    @BeforeEach
    void setup() {
        entry = new Entry(CarName.splitInputCarNames("ray,k3,niro"));
    }

    @Test
    void 자동차_레이싱_참가자_등록_검증() {
        assertThat(entry.getEntryList().get(0).getName().toText()).isEqualTo("ray");
    }

    @Test
    void 자동차_레이싱_참가자_출발_위치_확인() {
        assertThat(entry.getEntryList().get(0).getLocation().toResultText()).isEqualTo("");
        assertThat(entry.getEntryList().get(0).getLocation().toNumber()).isEqualTo(0);
    }
}
