package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarLocationTest {
    CarLocation carLocation;

    @BeforeEach
    void setup() {
        carLocation = new CarLocation();
    }

    @Test
    void 자동차_전진시_위치_숫자_검증() {
        carLocation.moveForward();
        carLocation.moveForward();
        assertThat(carLocation.toNumber()).isEqualTo(2);
    }

    @Test
    void 자동차_전진시_위치_텍스트_검증() {
        carLocation.moveForward();
        carLocation.moveForward();
        assertThat(carLocation.toResultText()).isEqualTo("--");
    }
}
