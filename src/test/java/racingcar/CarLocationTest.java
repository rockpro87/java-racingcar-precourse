package racingcar;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarLocationTest {
    static CarLocation carLocation;

    @BeforeAll
    static void setup() {
        carLocation = new CarLocation();
        carLocation.moveForward();
        carLocation.moveForward();
    }

    @Test
    void 자동차_전진시_위치_숫자_검증() {
        assertThat(carLocation.toNumber()).isEqualTo(2);
    }

    @Test
    void 자동차_전진시_위치_텍스트_검증() {
        assertThat(carLocation.toResultText()).isEqualTo("--");
    }
}
